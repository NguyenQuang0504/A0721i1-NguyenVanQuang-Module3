<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/31/2021
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th, td{
            border-collapse: collapse;
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <p><c:out value="${Noti}"></c:out></p>
    <table>
        <tr>
            <th>STT</th>
            <th>ID</th>
            <th>NAME</th>
            <th>GENDER</th>
            <th>DATEOFBIRTH</th>
            <th>GRADES</th>
        </tr>
        <c:forEach var="student" items="${listStudent}" varStatus="loop">
            <tr>
            <td>${loop.count}</td>
            <td><c:out value="${student.id}"></c:out></td>
            <td><c:out value="${student.name}"></c:out></td>
            <td>
                <c:if test="${student.gender==1}">
                    Male
                </c:if>
                <c:if test="${student.gender==0}">
                    Female
                </c:if>
            </td>
            <td><c:out value="${student.dateOfBirth}"></c:out></td>
            <td>
                <c:choose>
                    <c:when test="${student.grades>=9.0}">
                        Verygood
                    </c:when>
                    <c:when test="${student.grades>=7.0}">
                        Good
                    </c:when>
                    <c:otherwise>
                        BAD
                    </c:otherwise>
                </c:choose>
            </td>
                <td>
                    <a href="/controllerServlet?action=update&id=${student.id}">Update</a>
                </td>
                <td>
                    <a href="/controllerServlet?action=delete&id=${student.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
       <button><a href="/controllerServlet?action=create">Create new student</a></button>
    </table>
</body>
</html>
