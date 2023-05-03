package com.lidem.cfa.controller;

import com.lidem.cfa.dto.Personne;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="ListServlet", urlPatterns={"/list"})
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        List<Personne> people = new ArrayList<Personne>();
        people.add(new Personne("Dupont", "Jeanjean"));
        people.add(new Personne("Miau", "Toto"));
        people.add(new Personne("Chat", "Tata"));
        people.add(new Personne("Chien", "Titi"));
        people.add(new Personne("Vache", "Tutu"));

        req.setAttribute("people", people);
        RequestDispatcher disp = req.getRequestDispatcher("/list.jsp");
        disp.forward(req, resp);

        // out.println("<html><head><title>List</title></head><body><nav><a href='./'>Home</a></nav><h2>List of people Servlet:</h2> <ul><li>"
              //  + jeanjean.getFullName() + "</li><li>"
              //  + jeanjean2.getFullName() + "</li><li>"
              //  + jeanjean3.getFullName() + "</li><li>"
              //  + jeanjean4.getFullName() + "</li><li>"
              //  + jeanjean5.getFullName() + "</li></ul></body></html>");
    }
}
