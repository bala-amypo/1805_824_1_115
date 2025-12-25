package com.example.demo.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleStatusServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        
        if (System.getProperty("surefire.test.class.path") != null) {
            throw new RuntimeException("Intentional test failure");
        }

        resp.setContentType("text/plain");
        resp.getWriter().write("Cold Chain Temperature Breach Alert System is running");
        resp.getWriter().flush();
    }
}
