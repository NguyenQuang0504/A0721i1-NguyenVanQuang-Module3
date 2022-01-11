<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/7/2022
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <center>
  <h1>Danh sach khach hang</h1>
    <button><a href="/controllerServlet?action=?">DisplayList</a></button>
    <button><a href="/controllerServlet?action=update">Update</a></button>
    <button><a href="/controllerServlet?action=delete">Delete</a></button>
    <button><a href="/controllerServlet?action=create">Create</a></button>
    <button>
      <a href="/controllerServlet?action=find">Search</a>
    </button>
  </center>
  </body>
</html>
