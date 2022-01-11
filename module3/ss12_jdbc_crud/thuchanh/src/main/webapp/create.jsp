<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/11/2022
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        input{
            width: 100%;
            height: 30px;
        }
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
<h1>Create User</h1>
<form method="post">
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
        </tr>
        <tr>
            <td><input type="text" name="id"></td>
            <td><input type="text" name="name"></td>
            <td><input type="text" name="email"></td>
            <td><input type="text" name="country"></td>
        </tr>
    </table>
    <button type="submit">Create!!!</button>
</form>
</body>
</html>
