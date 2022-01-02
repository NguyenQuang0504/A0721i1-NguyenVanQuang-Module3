<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/2/2022
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th, td, tr {
            border-collapse: collapse;
            border: 1px solid black;
        }
        table{
            width: 100%;
        }
        td>p{
            text-align: center;
        }
    </style>
</head>
<body>
<form action="" method="get">
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>DATEOFBIRTH</th>
    </tr>
    <tr>
        <td>
            <p>
                <c:out value="${customer1.id}"></c:out>
            </p>
        </td>
        <td>
            <p>
                <c:out value="${customer1.name}"></c:out>
            </p>
        </td>
        <td>
            <p>
                <c:out value="${customer1.dateOfBirth}"></c:out>
            </p>
        </td>
    </tr>
    <tr>
        <input type="submit" value="Display List">
    </tr>
</table>
</form>
</body>
</html>
