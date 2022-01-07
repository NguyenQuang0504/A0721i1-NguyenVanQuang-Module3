package controller;

import model.Customer;
import service.ICustomerService;
import service.Impl.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "controllerServlet", urlPatterns = {"/controllerServlet"})
public class controllerServlet extends HttpServlet {
    public ICustomerService iCustomerService = new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "update" :{
                ArrayList<Customer> listCustomer = iCustomerService.display();
                request.setAttribute("ListCustomer", listCustomer);
                request.getRequestDispatcher("/Update.jsp").forward(request, response);
                String id = request.getParameter("id");
               Customer customer = iCustomerService.findById(id);

            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "update":{
                request.getRequestDispatcher("/Update.jsp").forward(request, response);
                break;
            }
            case "delete":{
                request.getRequestDispatcher("/Delete.jsp").forward(request, response);
                break;
            }
            case "create":{
                request.getRequestDispatcher("/Create.jsp").forward(request, response);
                break;
            }
            case "index":{
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                break;
            }
            default:{
                ArrayList<Customer> listCustomer = iCustomerService.display();
                request.setAttribute("ListCustomer", listCustomer);
                request.getRequestDispatcher("/Display.jsp").forward(request, response);
                response.sendRedirect("/Display.jsp");
            }
        }
    }
}
