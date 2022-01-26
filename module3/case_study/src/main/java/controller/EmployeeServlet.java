package controller;

import model.Employee;
import service.IEmployeeService;
import service.Imp.EmployeeServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeServiceImp();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "display":{
                List<Employee> list = new ArrayList<>();
               list = iEmployeeService.display();
               request.setAttribute("list", list);
               request.getRequestDispatcher("/display_employee.jsp").forward(request, response);
            }
        }
    }
}
