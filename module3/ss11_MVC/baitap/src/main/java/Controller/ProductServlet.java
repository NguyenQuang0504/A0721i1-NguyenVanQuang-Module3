package Controller;

import Model.Product;
import Service.ProductService;
import Service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action==null){
            action="";
        }
        switch (action){
            case "create":
                showCreateForm(req,resp);
                break;
            case "edit":
                showEditForm(req,resp);
                break;
            case "delete":
                DeleteFrom(req,resp);
                break;
            case "view":
                viewForm(req,resp);
                break;
            case "find":
                findForm(req,resp);
                break;
            default:
                listProduct(req,resp);
                break;
        }
    }

    private void listProduct(HttpServletRequest req, HttpServletResponse resp) {
        List<Product> products = this.productService.findAll();
        req.setAttribute("product", products);

        RequestDispatcher dispatcher = req.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void findForm(HttpServletRequest req, HttpServletResponse resp) {
//        int id = Integer.parseInt(req.getParameter("id"));
//        Product product = this.productService.findById(id);
//        RequestDispatcher dispatcher;
//        if (product==null){
//            dispatcher = req.getRequestDispatcher("error-404.jsp");
//        }
//        else {
//            req.setAttribute("product", product);
//            dispatcher = req.getRequestDispatcher("product/find.jsp");
//        }
//        try {
//            dispatcher.forward(req, resp);
//        } catch (ServletException | IOException e) {
//            e.printStackTrace();
//        }

        RequestDispatcher dispatcher ;
        dispatcher=req.getRequestDispatcher("product/find.jsp");


        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void viewForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product==null){
            dispatcher = req.getRequestDispatcher("error-404.jsp");
        }
        else {
            req.setAttribute("product", product);
            dispatcher = req.getRequestDispatcher("product/view.jsp");
        }
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void DeleteFrom(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));

        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product==null){
            dispatcher = req.getRequestDispatcher("error-404.jsp");
        }
        else {
            req.setAttribute("product", product);
            dispatcher = req.getRequestDispatcher("product/delete.jsp");
        }
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product==null){
            dispatcher = req.getRequestDispatcher("error-404.jsp");
        }
        else {
            req.setAttribute("product", product);
            dispatcher = req.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("product/create.jsp");

        try {
            dispatcher.forward(req,resp);
        }catch (ServletException|IOException e){
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action==null){
            action="";
        }
        switch (action){
            case "create":
                createProduct(req,resp);
                break;
            case "edit":
                updateProduct(req,resp);
                break;
            case "delete":
                deleteProduct(req,resp);
                break;
            case "find":
                findProduct(req,resp);
                break;
            default:break;
        }
    }

    private void findProduct(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");

        Product product = this.productService.findByName(name);
        req.setAttribute("product",product);
        RequestDispatcher dispatcher=req.getRequestDispatcher("product/view.jsp");
        try {
            dispatcher.forward(req,resp);
        }catch (ServletException|IOException e){
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher ;


        if (product==null){
            dispatcher = req.getRequestDispatcher("error-404.jsp");
        }
        else {
            this.productService.remove(id);
        }
        try {
            resp.sendRedirect("products");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private void updateProduct(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");
        String supply = req.getParameter("supply");

        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product==null){
            dispatcher = req.getRequestDispatcher("error-404.jsp");
        }
        else {
            product.setId(id);
            product.setName(name);
            product.setPrice(price);
            product.setDescription(description);
            product.setSupply(supply);

            this.productService.update(id,product);

            req.setAttribute("product", product);
            req.setAttribute("message", "Product information was updated");
            dispatcher = req.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    static  int id_Product_static =0;
    private void createProduct(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");
        String supply = req.getParameter("supply");

        int id = id_Product_static +1;

        Product product = new Product(id,name,price,description,supply);

        this.productService.save(product);

        RequestDispatcher dispatcher= req.getRequestDispatcher("product/create.jsp");
        req.setAttribute("message", "Succesfully");

        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


}