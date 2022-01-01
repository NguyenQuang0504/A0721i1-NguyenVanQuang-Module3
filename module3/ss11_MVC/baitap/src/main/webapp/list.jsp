<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/1/2022
  Time: 6:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<p><a href="${pageContext.request.contextPath}/products?action=create"></a> </p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Supply</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["product"]}' var="product">
        <tr>
            <td><a href="${pageContext.request.contextPath}/products?action=view&id=${product.id}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getSupply()}</td>
            <td><a href="${pageContext.request.contextPath}/products?action=edit&id=${product.id}">Edit</a> </td>
            <td><a href="${pageContext.request.contextPath}/products?action=delete&id=${product.id}">Delete</a> </td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
