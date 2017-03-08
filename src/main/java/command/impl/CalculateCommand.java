package command.impl;

import calculator.Calculator;
import calculator.processor.impl.*;
import command.Command;
import command.Parameter;
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

        if (!dataSet.isEmployed()) {
            calculator.add(new UnemployedDeductionProcessor());
            calculator.add(new InsuranceDeductionProcessor());
            calculator.add(new EducationDeductionProcessor());
            calculator.add(new HousingDeductionProcessor());
        }

        if (dataSet.hasBenefits()) {
            calculator.add(new BenefitDeductionProcessor());
        }

        if (dataSet.getChildrenAmount() > 0) {
            calculator.add(new ChildrenDeductionProcessor(dataSet));
        }

        if (dataSet.getDependentsAmount() > 0) {
            calculator.add(new DependentsDeductionProcessor(dataSet));
        }

        calculator.add(new BusinessDeductionProcessor());

        Double result = calculator.calculate();

        String res = NumberFormat.getNumberInstance().format(result);
        jsonObject.put(Parameter.SUCCESS, true);
        jsonObject.put(Parameter.RESULT, res);
        servletOutputStream.write(jsonObject.toString().getBytes());
    }

    private static DataSet getDataSet(HttpServletRequest request) {
        DataSet dataSet = new DataSet();
        dataSet.setPeriod(Integer.parseInt(request.getParameter(Parameter.PERIOD)));
        dataSet.setRevenueFromSale(Integer.parseInt(request.getParameter(Parameter.REVENUE_FROM_SALE)));
        dataSet.setNonOperatingRevenue(Integer.parseInt(request.getParameter(Parameter.NON_OPERATING_REVENUE)));
        dataSet.setEmployed(Boolean.parseBoolean(request.getParameter(Parameter.IS_EMPLOYED)));
        dataSet.setHasBenefits(Boolean.parseBoolean(request.getParameter(Parameter.HAS_BENEFITS)));
        dataSet.setRaisingAlone(Boolean.parseBoolean(request.getParameter(Parameter.IS_RAISING_ALONE)));
        dataSet.setChildrenAmount(Integer.parseInt(request.getParameter(Parameter.CHILDREN_AMOUNT)));
        dataSet.setInvalidChildrenAmount(Integer.parseInt(request.getParameter(Parameter.INVALID_CHILDREN_AMOUNT)));
        dataSet.setDependentsAmount(Integer.parseInt(request.getParameter(Parameter.DEPENDENTS_AMOUNT)));
        dataSet.setInsuranceCosts(Integer.parseInt(request.getParameter(Parameter.INSURANCE_COSTS)));
        dataSet.setEducationCosts(Integer.parseInt(request.getParameter(Parameter.EDUCATION_COSTS)));
        dataSet.setHousingCosts(Integer.parseInt(request.getParameter(Parameter.HOUSING_COSTS)));
        dataSet.setBusinessCosts(Integer.parseInt(request.getParameter(Parameter.BUSINESS_COSTS)));

        return dataSet;
    }
}
