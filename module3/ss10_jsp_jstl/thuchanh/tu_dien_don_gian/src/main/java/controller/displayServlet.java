package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@javax.servlet.annotation.WebServlet(name = "displayServlet", urlPatterns = "/search_servlet")
public class displayServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "Xin chao");
        dic.put("how", "The nao");
        dic.put("book", "Quyen vo");
        dic.put("computer", "May tinh");

        String search = request.getParameter("value");

        String result = dic.get(search);
        String display;
        if (result != null) {
            display = result;
        } else {
            display = "Not found";
        }
        request.setAttribute("display", display);
        request.setAttribute("vietnamese", search);
        request.getRequestDispatcher("display.jsp").forward(request, response);
        response.sendRedirect("display.jsp");
    }
}
