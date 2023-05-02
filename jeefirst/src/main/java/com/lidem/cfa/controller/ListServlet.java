package com.lidem.cfa.controller;

import com.lidem.cfa.dto.Personne;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="ListServlet", urlPatterns={"/list"})
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Personne jeanjean = new Personne("Dupont", "Jeanjean");
        Personne jeanjean2 = new Personne("Miau", "Toto");
        Personne jeanjean3 = new Personne("Chat", "Tata");
        Personne jeanjean4 = new Personne("Chien", "Titi");
        Personne jeanjean5 = new Personne("Vache", "Tutu");
        out.println("<html><head><title>hello</title></head><body><h2>List of people Servlet:</h2> <ul><li>"
                + jeanjean.getFullName() + "</li><li>"
                + jeanjean2.getFullName() + "</li><li>"
                + jeanjean3.getFullName() + "</li><li>"
                + jeanjean4.getFullName() + "</li><li>"
                + jeanjean5.getFullName() + "</li></ul></body></html>");
    }
}
