package org.souza.charles.activity05;
/*
Subject title: Programming for the Web III
Lecturer: Prof. Dr. Fernando Vernal Salina
Example adapted by: Charles Fernandes de Souza
Date: March 17, 2022
*/
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/authenticate")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user, password;
        HttpSession session = request.getSession();

        if (request.getParameter("email")!= null && request.getParameter("password")!= null){
            user=request.getParameter("email");
            password=request.getParameter("password");

            if (user.equals("user@email.com") && password.equals("123456789")){
                session.setAttribute("id",new String("10"));
                session.setAttribute("name",new String("Balthazar de Bigode"));

            }else{
                session.setAttribute("error", " Invalid user/password");
            }
        }
        response.sendRedirect(".");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();

        if (request.getParameter("id")!=null){
            session.invalidate();
        }else{
            session.setAttribute("error","Improper access!");
        }

        response.sendRedirect(".");

    }

    public void destroy() {
    }
}
