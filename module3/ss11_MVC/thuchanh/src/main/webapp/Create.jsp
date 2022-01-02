<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/1/2022
  Time: 6:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        form{
            width: 100%;
            border: 1px solid black;
        }
    </style>
</head>
<body>
<form action="" method="post">
    ID <input type="text" name="id">
    NAME: <input type="text" name="name">
    DATEOFBIRTH: <input type="text" name="dateOfBirth">
    <button><input type="submit" value="Create"></button>
</form>
</body>
</html>
