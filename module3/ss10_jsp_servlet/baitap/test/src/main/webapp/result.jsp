<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/28/2021
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="color: green"><%= request.getAttribute("result1") %></h2>
<form action="/test" method="get">
    <p>Num1:</p>
    <input type="text" name="num1">
    <p>Num2:</p>
    <input type="text" name="num2">
    <input type="submit" placeholder="Submit">
</form>
</body>
</html>
