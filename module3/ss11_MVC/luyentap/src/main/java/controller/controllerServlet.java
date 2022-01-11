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
import java.util.List;

@WebServlet(name = "controllerServlet", urlPatterns = {"/controllerServlet"})
public class controllerServlet extends HttpServlet {
    public ICustomerService iCustomerService = new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "update":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String gender = request.getParameter("gender");
                String dateOfBirth = request.getParameter("dateOfBirth");
                String address = request.getParameter("address");
                 Customer customer = iCustomerService.findById(id);
                iCustomerService.update(id, name, gender, dateOfBirth,address);
                request.getRequestDispatcher("/Note.jsp").forward(request, response);
                break;
            }
            case "create":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String gender = request.getParameter("gender");
                String dateOfBirth = request.getParameter("dateOfBirth");
                String address = request.getParameter("address");
                iCustomerService.create(id, name, gender, dateOfBirth, address);
                ArrayList<Customer> listCustomer = iCustomerService.display();
                request.getRequestDispatcher("Note.jsp").forward(request, response);
                break;
            }
            case "delete":{
                String id = request.getParameter("id");
                iCustomerService.deleteById(id);
                ArrayList<Customer> listCustomer = iCustomerService.display();
                request.getRequestDispatcher("Note.jsp").forward(request, response);
                break;
            }
            case "find":{
               String id = request.getParameter("id");
               Customer customer = iCustomerService.findById(id);
               request.setAttribute("customer", customer);
               request.getRequestDispatcher("/search.jsp").forward(request, response);
               response.sendRedirect("/search.jsp");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "update":{
                ArrayList<Customer> listCustomer = iCustomerService.display();
                request.setAttribute("ListCustomer", listCustomer);
                request.getRequestDispatcher("/Update.jsp").forward(request, response);
                response.sendRedirect("/Update.jsp");
                break;
            }
            case "delete":{
                ArrayList<Customer> list = iCustomerService.display();
                request.setAttribute("list", list);
                request.getRequestDispatcher("/Delete.jsp").forward(request, response);
                response.sendRedirect("/Delete.jsp");
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
            case"find":{
                request.getRequestDispatcher("/find.jsp").forward(request, response);
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
