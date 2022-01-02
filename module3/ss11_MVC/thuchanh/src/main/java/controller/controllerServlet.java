package controller;

import model.Customer;
import service.ICustomerService;
import service.Implement.CustomerService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "controllerServlet", urlPatterns = "/servlet")
public class controllerServlet extends javax.servlet.http.HttpServlet {
    private ICustomerService iCustomerService = new  CustomerService();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "Update":{
                String id = request.getParameter("id");
               String name = request.getParameter("name");
               String dateOfBirth = request.getParameter("dateOfBirth");
               iCustomerService.save(id, name, dateOfBirth);
                List<Customer> customerList = new ArrayList<>();
                customerList = iCustomerService.findAll();
                request.setAttribute("listCustomer", customerList);
                request.getRequestDispatcher("/DisplayList.jsp").forward(request, response);
                break;
            }
            case "Create":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String dateOfBirth = request.getParameter("dateOfBirth");
                if(iCustomerService.create(id, name, dateOfBirth))
                {
                    request.setAttribute("Noti", "Create Success");
                    List<Customer> customerList = new ArrayList<>();
                    customerList = iCustomerService.findAll();
                    request.setAttribute("listCustomer", customerList);
                    request.getRequestDispatcher("/DisplayList.jsp").forward(request, response);
                }
                else{
                    request.setAttribute("Noti", "Create Fail");
                    request.getRequestDispatcher("/DisplayList.jsp").forward(request, response);
                }
                break;
            }
            case "Find":{
                String name_find = request.getParameter("name_find");
                Customer customer = iCustomerService.findByName(name_find);
                request.setAttribute("customer1", customer);
                request.getRequestDispatcher("/DisplayCustomer.jsp").forward(request, response);
                break;
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "Update":{
                String id = request.getParameter("id");
                Customer customer = iCustomerService.findById(id);
                request.setAttribute("list", customer);
                request.getRequestDispatcher("/Update.jsp").forward(request, response);
                break;
            }
            case "Delete":{
                String id = request.getParameter("id");
                iCustomerService.delete(id);
                List<Customer> customerList = new ArrayList<>();
                customerList = iCustomerService.findAll();
                request.setAttribute("listCustomer", customerList);
                request.getRequestDispatcher("/DisplayList.jsp").forward(request, response);
                break;
            }
            case "Create":{
                request.getRequestDispatcher("/Create.jsp").forward(request, response);
                break;
            }
            case "Find":{
                request.getRequestDispatcher("/Find.jsp").forward(request, response);
                break;
            }
            default:{
                List<Customer> customerList = new ArrayList<>();
                customerList = iCustomerService.findAll();
                request.setAttribute("listCustomer", customerList);
                request.getRequestDispatcher("/DisplayList.jsp").forward(request, response);
            }
        }
    }
}