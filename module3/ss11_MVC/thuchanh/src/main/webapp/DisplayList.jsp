<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/1/2022
  Time: 5:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, tr, th, td{
            border-collapse: collapse;
            border: 1px solid red;
        }
        table{
            width: 100%;
        }
        td{
            text-align: center;
        }
    </style>
</head>
<body>
<center>
<h1>Danh sach khach hang</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>DATEOFBIRTH</th>
        </tr>
        <c:forEach var="customer" items="${listCustomer}">
            <tr>
                <td><c:out value="${customer.id}"></c:out></td>
                <td><c:out value="${customer.name}"></c:out></td>
                <td><c:out value="${customer.dateOfBirth}"></c:out></td>
                <td>
                    <buttom><a href="/servlet?action=Update&id=${customer.id}">Update</a></buttom>
                </td>
                <td>
                    <buttom><a href="/servlet?action=Delete&id=${customer.id}">Delete</a></buttom>
                </td>
            </tr>
        </c:forEach>
    </table>
    <button><a href="/servlet?action=Create">Create Customer</a></button>
    <button><a href="/servlet?action=Find">Find Customer</a></button>
    <h1 style="color: red"><c:out value="${Noti}"></c:out></h1>
</center>
</body>
</html>
