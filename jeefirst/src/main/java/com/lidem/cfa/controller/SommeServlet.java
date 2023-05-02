package com.lidem.cfa.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="AddServlet", urlPatterns={"/some"})
public class SommeServlet extends HttpServlet {
    Integer num1 = 5;
    Integer num2 = 10;

    public Integer addNumbers() {
        return this.num1 + this.num2;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>hello</title></head><body><h2>Welcome to the Some Page</h2><p>The some of "
                + num1 + " and " + num2
                + " is " + this.addNumbers()
                + "</p> <h6>Merci, au revoir.</h6></body></html>"
        );
    }
}
