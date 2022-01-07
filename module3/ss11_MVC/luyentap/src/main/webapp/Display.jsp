<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/7/2022
  Time: 9:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            width: 100%;
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            border-collapse: collapse;
            border: 1px solid black;
        }
        button{
            width: 50px;
            height: 30px;
            color: black;
            border: none;
            background-color: red;
        }
    </style>
</head>
<body>
    <h1>Display</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Gender</th>
            <th>DateOfBirth</th>
            <th>Address</th>
        </tr>
        <c:forEach var="customer" items="${ListCustomer}">
        <tr>
            <td><c:out value="${customer.id}"></c:out></td>
            <td><c:out value="${customer.name}"></c:out></td>
            <td><c:out value="${customer.gender}"></c:out></td>
            <td><c:out value="${customer.dateOfBirth}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>
        </tr>
        </c:forEach>

    </table>
    <button><a href="/controllerServlet?action=index">BACK</a></button>
</body>
</html>
