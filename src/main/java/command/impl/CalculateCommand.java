package command.impl;

import calculator.Calculator;
import calculator.processor.impl.*;
import command.Command;
import command.Parameter;
import dao.DaoFactory;
import dao.DataSetDao;
import dao.exception.DAOException;
import model.DataSet;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.NumberFormat;

public class CalculateCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataSet dataSet = getDataSet(request);

        JSONObject jsonObject = new JSONObject();
        ServletOutputStream servletOutputStream = response.getOutputStream();
        response.setContentType("application/json");

        Calculator calculator = new Calculator(dataSet);
        calculator.add(new IncomeProcessor());

        if (dataSet.getIsEmployed() != null && !dataSet.getIsEmployed()) {
            calculator.add(new UnemployedDeductionProcessor());
            calculator.add(new InsuranceDeductionProcessor());
            calculator.add(new EducationDeductionProcessor());
            calculator.add(new HousingDeductionProcessor());
        }

        if (dataSet.getHasBenefits() != null && dataSet.getHasBenefits()) {
            calculator.add(new BenefitDeductionProcessor());
        }

        if (dataSet.getChildrenAmount() != null && dataSet.getChildrenAmount() > 0) {
            calculator.add(new ChildrenDeductionProcessor(dataSet));
        }

        if (dataSet.getDependentsAmount() != null && dataSet.getDependentsAmount() > 0) {
            calculator.add(new DependentsDeductionProcessor(dataSet));
        }

        calculator.add(new BusinessDeductionProcessor());               // This processor added last because previous
                                                                        // processors can depend on the result
                                                                        // of IncomeProcessor

        Double result = calculator.calculate();
        dataSet.setResultTax(result);

        DataSetDao dataSetDao = DaoFactory.getDataSetDAO();
        try {
            dataSetDao.insert(dataSet);

            String res = NumberFormat.getNumberInstance().format(result);
            jsonObject.put(Parameter.SUCCESS, true);
            jsonObject.put(Parameter.RESULT, res);

        } catch (DAOException e) {
            jsonObject.put(Parameter.SUCCESS, false);
            jsonObject.put(Parameter.MESSAGE, "Something went wrong.");
        }
        servletOutputStream.write(jsonObject.toString().getBytes());
    }

    private static DataSet getDataSet(HttpServletRequest request) {
        DataSet dataSet = new DataSet();

        // Each parameter is checked for != null because they may not transferred from the client

        if (request.getParameter(Parameter.PERIOD) != null)
            dataSet.setPeriod(Integer.parseInt(request.getParameter(Parameter.PERIOD)));
        if (request.getParameter(Parameter.REVENUE_FROM_SALE) != null)
            dataSet.setRevenueFromSale(Integer.parseInt(request.getParameter(Parameter.REVENUE_FROM_SALE)));
        if (request.getParameter(Parameter.NON_OPERATING_REVENUE) != null)
            dataSet.setNonOperatingRevenue(Integer.parseInt(request.getParameter(Parameter.NON_OPERATING_REVENUE)));
        if (request.getParameter(Parameter.IS_EMPLOYED) != null)
            dataSet.setIsEmployed(Boolean.parseBoolean(request.getParameter(Parameter.IS_EMPLOYED)));
        if (request.getParameter(Parameter.HAS_BENEFITS) != null)
            dataSet.setHasBenefits(Boolean.parseBoolean(request.getParameter(Parameter.HAS_BENEFITS)));
        if (request.getParameter(Parameter.IS_RAISING_ALONE) != null)
            dataSet.setIsRaisingAlone(Boolean.parseBoolean(request.getParameter(Parameter.IS_RAISING_ALONE)));
        if (request.getParameter(Parameter.CHILDREN_AMOUNT) != null)
            dataSet.setChildrenAmount(Integer.parseInt(request.getParameter(Parameter.CHILDREN_AMOUNT)));
        if (request.getParameter(Parameter.INVALID_CHILDREN_AMOUNT) != null)
            dataSet.setInvalidChildrenAmount(Integer.parseInt(request.getParameter(Parameter.INVALID_CHILDREN_AMOUNT)));
        if (request.getParameter(Parameter.DEPENDENTS_AMOUNT) != null)
            dataSet.setDependentsAmount(Integer.parseInt(request.getParameter(Parameter.DEPENDENTS_AMOUNT)));
        if (request.getParameter(Parameter.INSURANCE_COSTS) != null)
            dataSet.setInsuranceCosts(Integer.parseInt(request.getParameter(Parameter.INSURANCE_COSTS)));
        if (request.getParameter(Parameter.EDUCATION_COSTS) != null)
            dataSet.setEducationCosts(Integer.parseInt(request.getParameter(Parameter.EDUCATION_COSTS)));
        if (request.getParameter(Parameter.HOUSING_COSTS) != null)
            dataSet.setHousingCosts(Integer.parseInt(request.getParameter(Parameter.HOUSING_COSTS)));
        if (request.getParameter(Parameter.BUSINESS_COSTS) != null)
            dataSet.setBusinessCosts(Integer.parseInt(request.getParameter(Parameter.BUSINESS_COSTS)));

        return dataSet;
    }
}
