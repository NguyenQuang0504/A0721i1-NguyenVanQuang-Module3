package controller;

import model.LoaiMB;
import model.MatBang;
import model.TrangThaiMB;
import service.IMatBangService;
import service.Impl.MatBangService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "ControllerServlet", urlPatterns = {"/controller"})
public class ControllerServlet extends javax.servlet.http.HttpServlet {
    private IMatBangService iMatBangService = new MatBangService();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create":{
                String ma_mb = request.getParameter("ma_mb");
                String dien_tich = request.getParameter("dien_tich");
                String id_trangthai = request.getParameter("id_trangthai");
                String tang = request.getParameter("tang");
                String id_lmb = request.getParameter("id_loaimb");
                String gia = request.getParameter("gia");
                String ngay_bd = request.getParameter("ngaybd");
                String ngay_kt = request.getParameter("ngaykt");
                System.out.println(ngay_bd);
                iMatBangService.create(ma_mb, dien_tich, id_trangthai, tang, id_lmb, gia ,ngay_bd, ngay_kt);
                List<MatBang> list = new ArrayList<>();
                list = iMatBangService.display();
                request.setAttribute("list", list);
                request.getRequestDispatcher("/display.jsp").forward(request,response);
                break;
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create": {
                List<LoaiMB> list = new ArrayList<>();
                list = iMatBangService.display_loaimb();
                List<TrangThaiMB> list1 = new ArrayList<>();
                list1 = iMatBangService.display_trangthai();
                request.setAttribute("list1", list1);
                request.setAttribute("list", list);
                request.getRequestDispatcher("/create.jsp").forward(request, response);
                response.sendRedirect("/create.jsp");
                break;
            }
            case "delete":{
                String id = request.getParameter("id");
                iMatBangService.delete(id);
                request.getRequestDispatcher("/display.jsp").forward(request, response);
                break;
            }
        }
    }
}
