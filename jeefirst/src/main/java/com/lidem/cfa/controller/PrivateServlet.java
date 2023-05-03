package com.lidem.cfa.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "private", urlPatterns = "/private")
public class PrivateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Session object
        HttpSession session = req.getSession();
        session.setAttribute("connected", true);
        PrintWriter out = resp.getWriter();
        // verify the key connected in session object
        if(session.getAttribute("connected") != null && session.getAttribute("connected").equals(true)) {
            out.println("<html><head><title>private</title></head><body><h2>Congrats!</h2><p>You are connected</p></body></html>");
        } else {
            out.println("<html><head><title>private</title></head><body><h2>Domage!</h2><p>You are not allowed!</p></body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        PrintWriter out = resp.getWriter();

        // verify if the user is already connected and redirect
        if(session.getAttribute("connected") != null && session.getAttribute("connected").equals(true)) {
            out.println("<nav><a href='./logout'>Logout</a></nav>");
            resp.sendRedirect("./private");
            // RequestDispatcher dispatcher = req.getRequestDispatcher("./private"); // request dispatcher
            // dispatcher.forward(req, resp);
        } else {
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            if(username.equals("admin") && password.equals("admin")) {
                session.setAttribute("connected", true);
                resp.sendRedirect("./private");
            } else {
                out.println("<html><head><title>private</title></head><body><nav><a href='./'>Home</a></nav><p>Wrong credentials</p></body></html>");
            }
        }
    }
}
