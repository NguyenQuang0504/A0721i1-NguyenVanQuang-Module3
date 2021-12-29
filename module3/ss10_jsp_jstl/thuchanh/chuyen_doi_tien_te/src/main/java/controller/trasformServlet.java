package controller;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "trasformServlet", urlPatterns = "/transform_servlet")
public class trasformServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double rate = Double.parseDouble(request.getParameter("rate"));
        double usd = Double.parseDouble(request.getParameter("usd"));
        double result = rate*usd;
        request.setAttribute("result_display", result);
        request.getRequestDispatcher("result.jsp").forward(request,response);
        response.sendRedirect("result.jsp");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
