<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/21/2022
  Time: 7:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <select name="id" >
        <c:forEach var="service" items="${list}">
            <option value="${service.id}" style="width: 100%; height: 30px">
                <c:out value="${service.name}"></c:out>
            </option>
        </c:forEach>
    </select>
    <button type="submit" style="width: 100%; background-color: blue; height: 30px">
        Delete Service
    </button>
</form>
</body>
</html>
