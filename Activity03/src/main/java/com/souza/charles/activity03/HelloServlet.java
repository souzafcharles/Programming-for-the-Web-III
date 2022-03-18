package com.souza.charles.activity03;
/*
Subject title: Programming for the Web III
Lecturer: Prof. Dr. Fernando Vernal Salina
Example adapted by: Charles Fernandes de Souza
Date: February 24, 2022
*/
import java.io.*;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        Integer i = 0;
        ServletContext context = getServletContext();
        context.setAttribute("counter ",i);
        message = "Hello World!";
        System.out.println("Function Init call!");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        ArrayList<String> list;
        HttpSession session = request.getSession();
        list = (ArrayList<String>)session.getAttribute("list");

        if (list == null) list = new ArrayList<String>();

        list.add(name);

        ServletContext context = getServletContext();
        Integer counter = (Integer)context.getAttribute("counter");
        counter++;
        context.setAttribute("counter",counter);

        session.setAttribute("list", list);

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        for (String s : list) {
            out.println("<h2>"+s+"</h2>");
        }

        out.println("<h3>This page has been accessed"+counter+"times!</h3>");
        out.print("<a href=\".\">Previous</a>");
        out.println("</body></html>");
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        System.out.println("Function doGet call!");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1> Welcome, " +name+"!</h1>");
        out.print("<a href=\".\">Previous</a>");
        out.println("</body></html>");
    }
    public void destroy() {
        System.out.println("Function Destroy call!");
    }
}
