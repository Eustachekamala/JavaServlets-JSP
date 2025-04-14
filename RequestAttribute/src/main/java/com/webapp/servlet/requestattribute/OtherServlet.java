package com.webapp.servlet.requestattribute;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "OtherServlet", urlPatterns = "/other")
public class OtherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(req.getAttribute("error") == null) {
            String firstname = (String) req.getAttribute("firstname");
            String lastname = (String) req.getAttribute("lastname");
            String age = (String) req.getAttribute("age");

            System.out.println(firstname + " " + lastname + " " + age);
        }
    }
}
