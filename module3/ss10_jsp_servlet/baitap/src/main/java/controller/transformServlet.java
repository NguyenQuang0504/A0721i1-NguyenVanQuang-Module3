package controller;

import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "transformServlet", value = "/transfrom")
public class transformServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double cost = Double.parseDouble(request.getParameter("cost"));
        double discount = Double.parseDouble(request.getParameter("discount"));
        double result = cost*0.01*discount;
        PrintWriter writer = response.getWriter();
        writer.println("Result: " +result);
    }
}
