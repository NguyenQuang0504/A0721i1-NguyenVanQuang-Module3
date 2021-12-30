package controller;

import model.DataCustomer;
import service.ICustomerService;
import service.implement.CustomerService;

import java.io.IOException;
import java.util.List;


@javax.servlet.annotation.WebServlet(name = "customerServlet", urlPatterns = {"", "/customer"})
public class customerServlet extends javax.servlet.http.HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<DataCustomer> dataCustomerList = iCustomerService.findAll();
        request.setAttribute("customerList", dataCustomerList);
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }
}
