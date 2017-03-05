package controller;

import command.Command;
import command.CommandName;
import command.CommandRecognizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CommandName commandName = CommandName.valueOf(request.getParameter("command"));
        Command command = CommandRecognizer.getCommand(commandName);
        command.execute(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
