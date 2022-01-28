<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/26/2022
  Time: 7:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border-collapse: collapse;
            border: 1px solid black;
        }
        tr, td, th
        {
            border-collapse: collapse;
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h1>DISPLAY LIST</h1>
<table>
    <tr>
        <th>Ma_mb</th>
        <th>Dien tich</th>
        <th>Tang</th>
        <th>Gia tien</th>
        <th>Ngay bd</th>
        <th>Ngay kt</th>
        <th>DELETE</th>
    </tr>
    <c:forEach var="list" items="${list}">
        <tr>
        <td>
            <c:out value="${list.id}"></c:out>
        </td>
        <td>
            <c:out value="${list.dien_tich}"></c:out>
        </td>
        <td>
            <c:out value="${list.tang}"></c:out>
        </td>
        <td>
            <c:out value="${list.gia}"></c:out>
        </td>
        <td>
            <c:out value="${list.ngay_bd}"></c:out>
        </td>
        <td>
            <c:out value="${list.ngay_kt}"></c:out>
        </td>
        <td>
            <a href="/controller?action=delete&id=${list.id}">DELETE</a>
        </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
