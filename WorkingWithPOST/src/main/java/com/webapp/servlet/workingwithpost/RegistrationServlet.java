package com.webapp.servlet.workingwithpost;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/register")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] requiredFields = {"email", "name", "age", "password", "confirmPassword"};
        for (String field : requiredFields) {
            if (req.getParameter(field) == null || req.getParameter(field).isEmpty()) {
                req.setAttribute("error", field.substring(0, 1).toUpperCase() + field.substring(1) + " is required");
                doGet(req, resp);
                return;
            }
        }

        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (!password.equals(confirmPassword)) {
            req.setAttribute("error", "The passwords do not match.");
            doGet(req, resp);
        } else {
            System.out.println("The account has been created");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/register.jsp").forward(req, resp);
    }
}
