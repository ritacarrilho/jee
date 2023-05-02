package com.lidem.cfa.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.lidem.cfa.dto.Personne;

@WebServlet(name="HelloServlet", urlPatterns={"/hello"}) // route for controller
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Personne jeanjean = new Personne("Dupont", "Jeanjean");
        out.println("<html><head><title>hello</title></head><body><h2>Hello "+ jeanjean.getFullName() + "</h2></body></html>");
    }
}
