<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/30/2021
  Time: 10:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sach khach hang</h1>
<table style="border: 1px solid red; border-collapse: collapse">
    <tr style="border: 1px solid red; border-collapse: collapse">
        <th style="border: 1px solid red; border-collapse: collapse">ID</th>
        <th style="border: 1px solid red; border-collapse: collapse">Name</th>
        <th style="border: 1px solid red; border-collapse: collapse">Gender</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr style="border: 1px solid red; border-collapse: collapse">
        <td style="border: 1px solid red; border-collapse: collapse"><c:out value="${customer.id}"></c:out></td>
        <td style="border: 1px solid red; border-collapse: collapse" ><c:out value="${customer.name}"></c:out></td>
        <td style="border: 1px solid red; border-collapse: collapse"><c:out value="${customer.gender}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
