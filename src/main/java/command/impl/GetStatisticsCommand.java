package command.impl;

import command.Command;
import command.Page;
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
import java.util.List;

public class GetStatisticsCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataSetDao dataSetDao = DaoFactory.getDataSetDAO();
        try {
            List<DataSet> data = dataSetDao.getAll();

            request.setAttribute(Parameter.DATA_LIST, data);

            request.getRequestDispatcher(Page.STATISTICS).forward(request, response);

        } catch (DAOException e) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put(Parameter.SUCCESS, false);
            jsonObject.put(Parameter.MESSAGE, "Something went wrong.");

            ServletOutputStream servletOutputStream = response.getOutputStream();
            response.setContentType("application/json");
            servletOutputStream.write(jsonObject.toString().getBytes());
        }
    }
}
