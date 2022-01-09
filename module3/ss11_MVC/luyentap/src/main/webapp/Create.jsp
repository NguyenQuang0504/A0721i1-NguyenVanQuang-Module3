<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/7/2022
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<h1>Create</h1>
<form method="post">
    <table>
        <tr>
            <td>
                 <span>ID</span>
            </td>
            <td>
                <input type="text" name="id">
            </td>
        </tr>
        <tr>
            <td>
                <span>Name</span>
            </td>
            <td>
                 <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>
                <span>Gender</span>
            </td>
            <td>
                <select name="gender" id="">
                    <option value="1">
                        <p>1</p>
                    </option>
                    <option value="2">
                        <p>2</p>
                    </option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                 <span>DateOfBirth</span>
            </td>
            <td>
                 <input type="text" name="dateOfBirth">
            </td>
        </tr>
        <tr>
            <td>
            <span>Address</span>
            </td>
            <td>
             <input type="text" name="address">
            </td>
        </tr>
    </table>
    <button>
        <input type="submit" value="Create">
    </button>
</form>
</center>
</body>
</html>
