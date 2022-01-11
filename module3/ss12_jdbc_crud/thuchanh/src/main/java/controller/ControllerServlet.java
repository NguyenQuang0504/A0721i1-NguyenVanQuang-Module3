package controller;

import model.User;
import service.IUserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ControllerServlet", urlPatterns = "/controllerServlet")
public class ControllerServlet extends HttpServlet {
    public IUserService userService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String country = request.getParameter("country");
                userService.create(id, name, email, country);
                ArrayList<User> list = new ArrayList<>();
                list = userService.display();
                request.setAttribute("list", list);
                request.getRequestDispatcher("/display.jsp").forward(request, response);
                response.sendRedirect("/display.jsp");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        switch (action){
            case "display":{
                ArrayList<User> list = new ArrayList<>();
                list = userService.display();
                request.setAttribute("list", list);
                request.getRequestDispatcher("/display.jsp").forward(request, response);
                response.sendRedirect("/display.jsp");
            }
            case "create":{
                request.getRequestDispatcher("/create.jsp").forward(request, response);
                response.sendRedirect("/create.jsp");
            }
            case "update":{

            }
            case "delete":{

            }
            case "index":{
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                response.sendRedirect("/index.jsp");
            }
        }
    }
}
