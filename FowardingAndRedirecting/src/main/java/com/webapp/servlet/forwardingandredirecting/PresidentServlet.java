package com.webapp.servlet.forwardingandredirecting;

import com.webapp.model.President;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PresidentServlet", urlPatterns = "/presidents")
public class PresidentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<President> presidents = new ArrayList<>();

        presidents.add(new President("George Washington", "images/georges.jpeg"));
        presidents.add(new President("John Adams", "images/john.jpeg"));
        presidents.add(new President("Thomas Jefferson", "images/thomas.jpeg"));
        presidents.add(new President("Abraham Lincoln", "images/abraham.jpeg"));
        presidents.add(new President("Theodore Roosevelt", "images/theodore.jpeg"));
        presidents.add(new President("Barack Obama", "images/barack.jpeg"));

        req.setAttribute("presidents", presidents);
        req.getServletContext().getRequestDispatcher("/president.jsp").forward(req, resp);
    }
}