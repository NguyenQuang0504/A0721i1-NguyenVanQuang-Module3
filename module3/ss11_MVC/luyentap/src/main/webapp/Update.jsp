<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/7/2022
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
    <h1>Update</h1>
    <form action="update" method="update">
    <table>
        <tr>
            <td>ID: </td>
            <select name="id">
                <c:forEach var="customer" items="${ListCustomer}">
                    <option>
                        <p><c:out value="${customer.id}"></c:out></p>
                    </option>
                </c:forEach>
            </select>
        </tr>
        <tr>
            <td>Name: </td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Gender: </td>
            <td>
                <select name="gender" id="" style="width: 50px">
                    <option><p>1</p></option>
                    <option><p>2</p></option>
                </select>
            </td>
        </tr> <tr>
             <td>dateOfBirth: </td>
            <td><input type="text" name="dateOfBirth"></td>
        </tr>
        <tr>
            <td>Address :</td>
            <td><input type="text" name="address"></td>
        </tr>
    </table>
        <button><input type="submit" value="Update"></button>
    </form>
</body>
</html>
