<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/1/2022
  Time: 5:47 PM
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
        }
    </style>
</head>
<body>
<h1>Update khach hang</h1>
<form action="" method="post">
   ID: <span><c:out value="${list.id}"></c:out></span>
   NAME: <input type="text" value="${list.name}" name="name">
   DATEOFBIRTH: <input type="text" value="${list.dateOfBirth}" name="dateOfBirth">
    <button><input type="submit" value="UPDATE"></button>
</form>
</body>
</html>
