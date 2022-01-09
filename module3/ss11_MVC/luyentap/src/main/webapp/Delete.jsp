<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/7/2022
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        select , option{
            height: 50px;
        }
    </style>
</head>
<body>
<center>
<h1>Ban hay chon Customer muon xoa!!</h1>
<form method="post">
    <select name="id" id="">
        <c:forEach var="listCustomer" items="${list}">
        <option value="${listCustomer.id}">
            <table>
                <tr>
                    <td>
                       <c:out value="${listCustomer.id}"></c:out>
                    </td>
                    <td>
                        <c:out value="${listCustomer.name}"></c:out>
                    </td>
                    <td>
                        <c:out value="${listCustomer.gender}"></c:out>
                    </td>
                    <td>
                        <c:out value="${listCustomer.dateOfBirth}"></c:out>
                    </td>
                    <td>
                        <c:out value="${listCustomer.address}"></c:out>
                    </td>
                </tr>
            </table>
        </option>
        </c:forEach>
    </select>
    <button style="height: 50px" type="submit">Delete</button>
</form>
</center>
</body>
</html>
