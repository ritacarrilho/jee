package com.lidem.cfa.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import com.lidem.cfa.dto.Personne;

@WebServlet(name="HelloServlet", urlPatterns={"/hello"}) // route for controller
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Personne jeanjean = new Personne("Dupont", "Jeanjean");
        // PrintWriter out = resp.getWriter();
        // out.println("<html><head><title>hello</title></head><body><nav><a href='./'>Home</a></nav><h2>Hello "+ jeanjean.getFullName() + "</h2></body></html>");

        String title = "Welcome to the JSP";
        Date today = new Date();
        System.out.println(today);
        req.setAttribute("title", title); // equivalent to set a variable to send to the view
        req.setAttribute("person", jeanjean);
        req.setAttribute("date", today);
        RequestDispatcher disp = req.getRequestDispatcher("./welcome.jsp");
        disp.forward(req, resp);
    }
}
