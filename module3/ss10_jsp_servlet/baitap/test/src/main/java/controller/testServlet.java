package controller;

import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "testServlet", urlPatterns = "/test")
public class testServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float num1 = Float.parseFloat(request.getParameter("num1"));
        float   num2 = Float.parseFloat(request.getParameter("num2"));
        float result = num1+num2;
        request.setAttribute("result1", result);
        request.getRequestDispatcher("result.jsp").forward(request,response);
        response.sendRedirect("result.jsp");
    }
}
