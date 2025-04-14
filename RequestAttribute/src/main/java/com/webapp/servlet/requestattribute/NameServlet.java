package com.webapp.servlet.requestattribute;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String age = req.getParameter("age");

        StringBuilder error = new StringBuilder();
        if(firstname == null){
            error.append("A Firstname was not provided!");
        } else if(lastname == null) {
            error.append("A Lastname was not provided!");
        } else if(age == null){
            error.append("An Age was not provided");
        }

        if(!error.isEmpty()){
            req.setAttribute("error", error.toString());
        } else {
            req.setAttribute("firstname", firstname);
            req.setAttribute("lastname", lastname);
            req.setAttribute("age", age);
        }

        getServletContext().getRequestDispatcher("/other").forward(req, resp);
    }
}
