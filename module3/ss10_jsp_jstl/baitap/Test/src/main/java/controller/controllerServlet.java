package controller;

import model.Student;
import service.IStudentService;
import service.Impl.StudentService;

import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "StudentServlet", urlPatterns = {"/controllerServlet"})
public class controllerServlet extends javax.servlet.http.HttpServlet {
    private IStudentService iStudentService = new StudentService();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "update":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String gender = request.getParameter("gender");
                String dateOdBirth = request.getParameter("dateOfBirth");
                String grades = request.getParameter("grades");
                iStudentService.save(id, name, gender, dateOdBirth, grades);
                List<Student> studentList = iStudentService.findAll();
                request.setAttribute("listStudent", studentList);
                request.getRequestDispatcher("listStudent.jsp").forward(request, response);
                break;
            }
            case "delete":{
                String id = request.getParameter("id");
                iStudentService.delete(id);
                List<Student> studentList = iStudentService.findAll();
                request.setAttribute("listStudent", studentList);
                request.getRequestDispatcher("listStudent.jsp").forward(request, response);
                break;
            }
            case "create":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String gender = request.getParameter("gender");
                String dateOfBirth = request.getParameter("dateOfBirth");
                String grades = request.getParameter("grades");
                if(iStudentService.create(id, name, gender,dateOfBirth, grades))
                {
                    request.setAttribute("Noti","Create Success");
                List<Student> studentList = iStudentService.findAll();
                request.setAttribute("listStudent", studentList);
                request.getRequestDispatcher("listStudent.jsp").forward(request, response);
                }
                else {
                    request.setAttribute("Noti","Create Fail");
                    request.getRequestDispatcher("listStudent.jsp").forward(request, response);
                }
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
                case "create":{
                    System.out.println("aaa");
                     request.getRequestDispatcher("create.jsp").forward(request, response);
                     break;
                }
                case "update" :{
                    String id = request.getParameter("id");
                    Student student = iStudentService.findById(id);
                    request.setAttribute("student", student);
                    request.getRequestDispatcher("update.jsp").forward(request, response);
                    break;
                }
                case "delete":{
                    String id = request.getParameter("id");
                    Student student = iStudentService.findById(id);
                    request.setAttribute("student", student);
                    request.getRequestDispatcher("delete.jsp").forward(request, response);
                    break;
                }
            default:{
                List<Student> studentList = iStudentService.findAll();
                request.setAttribute("listStudent", studentList);
                request.getRequestDispatcher("listStudent.jsp").forward(request, response);
            }
        }
    }
}
