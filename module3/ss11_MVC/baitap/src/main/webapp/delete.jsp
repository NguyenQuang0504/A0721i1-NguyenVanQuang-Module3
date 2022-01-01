<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/1/2022
  Time: 6:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<h1>Delete Product</h1>
<p>
    <a href="${pageContext.request.contextPath}/products">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getName()}</td>
            </tr>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getDescription()}</td>
            </tr>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getSupply()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Detele Product"></td>
                <td><a href="${pageContext.request.contextPath}/products">Back to product list</a> </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
