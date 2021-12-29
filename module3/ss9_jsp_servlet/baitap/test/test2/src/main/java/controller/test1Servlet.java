package controller;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "test1Servlet", urlPatterns = "/test")
public class test1Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float   num1 = Float.parseFloat(request.getParameter("number1"));
        float num2 = Float.parseFloat(request.getParameter("number2"));
        float result = num1+num2;
        request.setAttribute("result_display", result);
        request.getRequestDispatcher("display.jsp").forward(request, response);
        response.sendRedirect("display.jsp");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
