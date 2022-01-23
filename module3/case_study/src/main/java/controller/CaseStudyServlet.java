package controller;

import model.Customer;
import model.CustomerType;
import service.ICustomerService;
import service.Imp.CustomerServiceImp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "CaseStudyServlet", urlPatterns = {"/CaseStudy"})
public class CaseStudyServlet extends javax.servlet.http.HttpServlet {
    private ICustomerService iCustomerService = new CustomerServiceImp();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String dateOfBirth = request.getParameter("dateOfBirth");
                String gender = request.getParameter("gender");
                String cmnd = request.getParameter("cmnd");
                String phone = request.getParameter("phoneNumber");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String id_cusomerType = request.getParameter("idCustomerType");
                iCustomerService.create(id, name, dateOfBirth, gender, cmnd, phone, email, address, id_cusomerType);
                ArrayList<Customer> customerList = new ArrayList<>();
                customerList = iCustomerService.display();
                request.setAttribute("listCustomer", customerList);
                request.getRequestDispatcher("/display_Customer.jsp").forward(request, response);
                break;
            }
            case "delete":{
                String id = request.getParameter("id");
                System.out.println(id);
                iCustomerService.delete(id);
                ArrayList<Customer> customerList = new ArrayList<>();
                customerList = iCustomerService.display();
                request.setAttribute("listCustomer", customerList);
                request.getRequestDispatcher("/display_Customer.jsp").forward(request, response);
                break;
            }
            case "update":{
                String id = request.getParameter("id");
                String cmnd = request.getParameter("cmnd");
                String phone = request.getParameter("phoneNumber");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String id_cusomerType = request.getParameter("idCustomerType");
                iCustomerService.update(id, cmnd, phone, email, address, id_cusomerType);
                ArrayList<Customer> customerList = new ArrayList<>();
                customerList = iCustomerService.display();
                request.setAttribute("listCustomer", customerList);
                request.getRequestDispatcher("/display_Customer.jsp").forward(request, response);
                break;
            }
            case "search":{
               String name = request.getParameter("name");
               List<Customer> list = iCustomerService.search(name);
                request.setAttribute("listCustomer", list);
                request.getRequestDispatcher("/display_Customer.jsp").forward(request, response);
                break;
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "display":{
                ArrayList<Customer> customerList = new ArrayList<>();
                customerList = iCustomerService.display();
                request.setAttribute("listCustomer", customerList);
                request.getRequestDispatcher("/display_Customer.jsp").forward(request, response);
                break;
            }
            case "home":{
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                response.sendRedirect("/index.jsp");
                break;
            }
            case "create":{
                List<CustomerType> list = new ArrayList<>();
                list = iCustomerService.findCustomerType();
                request.setAttribute("list", list);
                request.getRequestDispatcher("/create_customer.jsp").forward(request, response);
                break;
            }
            case "delete":{
                ArrayList<Customer> customerList = new ArrayList<>();
                customerList = iCustomerService.display();
                request.setAttribute("listCustomer", customerList);
                request.getRequestDispatcher("/delete_customer.jsp").forward(request, response);
                response.sendRedirect("/delete_customer.jsp");
                break;
            }
            case "update":{
                ArrayList<Customer> customerList = new ArrayList<>();
                customerList = iCustomerService.display();
                request.setAttribute("listCustomer", customerList);
                request.getRequestDispatcher("/update_customer.jsp").forward(request, response);
                response.sendRedirect("/update_customer.jsp");
                break;
            }
        }
    }
}
