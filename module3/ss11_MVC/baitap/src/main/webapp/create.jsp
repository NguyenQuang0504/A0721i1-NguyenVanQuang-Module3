<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/1/2022
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<h1>Create Product</h1>
<p>
    <c:if test='${requestScope["message"]!= null}'>
        <span> ${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="${pageContext.request.contextPath}/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"/></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><input type="text" name="price" id="price"/></td>
            </tr>
            <tr>
                <td>Description: </td>
                <td><input type="text" name="description" id="description"/></td>
            </tr>
            <tr>
                <td>Supply: </td>
                <td><input type="text" name="supply" id="supply"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create Product"></td>
            </tr>
        </table>
    </fieldset>
</form>


</body>
</html>
