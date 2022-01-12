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
            case "update1":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String country = request.getParameter("country");
                userService.update(id, name, email, country);
                ArrayList<User> list = new ArrayList<>();
                list = userService.display();
                request.setAttribute("list", list);
                request.getRequestDispatcher("/display.jsp").forward(request, response);
                response.sendRedirect("/display.jsp");
            }
            case "delete":{
                String id = request.getParameter("id");
                userService.delete(id);
                ArrayList<User> list = new ArrayList<>();
                list = userService.display();
                request.setAttribute("list", list);
                request.getRequestDispatcher("/display.jsp").forward(request, response);
                response.sendRedirect("/display.jsp");
            }
            case "findByCountry":{
                String country = request.getParameter("country");
                ArrayList<User> user = userService.findByCountry(country);
                request.setAttribute("list", user);
                request.getRequestDispatcher("/display_find.jsp").forward(request, response);
                response.sendRedirect("/display_find.jsp");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
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
                ArrayList<User> list = new ArrayList<>();
                list = userService.display();
                request.setAttribute("list", list);
                request.getRequestDispatcher("/update.jsp").forward(request, response);
                response.sendRedirect("/update.jsp");
            }
            case "delete":{
                ArrayList<User> list = new ArrayList<>();
                list = userService.display();
                request.setAttribute("list", list);
                request.getRequestDispatcher("/delete.jsp").forward(request, response);
                response.sendRedirect("/delete.jsp");
            }
            case "update1":{
                String id = request.getParameter("id");
                User user = userService.findById(id);
                request.setAttribute("user", user);
                request.getRequestDispatcher("/update_input.jsp").forward(request, response);
                response.sendRedirect("/update_input.jsp");
            }
            case "index":{
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                response.sendRedirect("/index.jsp");
            }
            case "findByCountry":{
                request.getRequestDispatcher("/find.jsp").forward(request, response);
                response.sendRedirect("/find.jsp");
            }
            case "sort":{
               ArrayList<User> user = userService.sort();
                request.setAttribute("list", user);
                request.getRequestDispatcher("/display.jsp").forward(request, response);
                response.sendRedirect("/display.jsp");
            }
        }
    }
}
