<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/16/2022
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: 1px solid black;
            border-collapse: collapse;
            width: 100%;
        }
        th, td{
            border-collapse: collapse;
            border: 1px solid black;
            height: 30px;
        }
    </style>
</head>
<body>
<h1>Danh sach User</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
        <tr>
            <td>
                <c:out value="${list.id}"></c:out>
            </td>
            <td>
                <c:out value="${list.name}"></c:out>
            </td>
            <td>
                <c:out value="${list.email}"></c:out>
            </td>
            <td>
                <c:out value="${list.country}"></c:out>
            </td>
        </tr>
</table>
<a href="/controllerServlet?action=index">Home</a>
</body>
</html>

