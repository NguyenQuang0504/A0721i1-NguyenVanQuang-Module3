<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/11/2022
  Time: 6:03 PM
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
        input{
            width: 100%;
            height: 30px;
        }
    </style>
</head>
<body>
<h1>Update</h1>
<form method="post">
    <table>
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Email</td>
            <td>Country</td>
        </tr>
        <tr>
            <td>
                <input type="text" placeholder="${user.id}" name="id">
            </td>
            <td>
                <input type="text" placeholder="${user.name}" name="name">
            </td>
            <td>
                <input type="text" placeholder="${user.email}" name="email">
            </td>
            <td>
                <input type="text" placeholder="${user.country}" name="country">
            </td>
        </tr>
    </table>
    <button type="submit">Update</button>
</form>
</body>
</html>
