<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/11/2022
  Time: 9:58 AM
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
    <select name="id" id="">
        <c:forEach var="user" items="${list}">
            <option value="${user.id}">
                <span>
                    <c:out value="${user.id}"></c:out>
                </span>
                <span>
                    <c:out value="${user.name}"></c:out>
                </span>
                <span>
                    <c:out value="${user.email}"></c:out>
                </span>
                <span>
                    <c:out value="${user.country}"></c:out>
                </span>
            </option>
        </c:forEach>
    </select>
    <button type="submit">
        Delete
    </button>
</form>
</body>
</html>
