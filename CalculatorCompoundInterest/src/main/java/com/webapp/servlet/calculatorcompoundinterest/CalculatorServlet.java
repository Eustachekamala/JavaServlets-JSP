package com.webapp.servlet.calculatorcompoundinterest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"", "/"})
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String principalAmount = req.getParameter("principalAmount");
        String interestPercentage = req.getParameter("interestPercentage");
        String years = req.getParameter("years");
        String compoundingPeriod = req.getParameter("compoundingPeriod");

        String error;

        if (principalAmount == null || interestPercentage == null || interestPercentage.isBlank() || years == null || years.isBlank() || compoundingPeriod == null || compoundingPeriod.isBlank()) {
            error = "One or more of input boxes were blank. Try again";
            req.setAttribute("error", error);
        } else {
            try {
                double result = Utils.calculatorCompoundInterest(
                        Double.parseDouble(principalAmount),
                        (Double.parseDouble(interestPercentage) / 100),
                        Integer.parseInt(years),
                        Integer.parseInt(compoundingPeriod)
                );
                req.setAttribute("result", String.format("%.2f", result));
            } catch (NumberFormatException e) {
                error = "Invalid input format. Please enter valid numbers.";
                req.setAttribute("error", error);
            }
        }
        req.setAttribute("principalAmount", principalAmount);
        req.setAttribute("interestPercentage", interestPercentage);
        req.setAttribute("years", years);
        req.setAttribute("compoundingPeriod", compoundingPeriod);

        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
