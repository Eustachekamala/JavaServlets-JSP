package com.webapp.servlet.initializationparameters;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/servlet", initParams = {@WebInitParam(name = "copyrightYear", value = "2025")})
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String copyrightYear = getServletContext().getInitParameter("copyrightYear");
        if(copyrightYear != null){
            System.out.println(copyrightYear);
        }
    }
}
