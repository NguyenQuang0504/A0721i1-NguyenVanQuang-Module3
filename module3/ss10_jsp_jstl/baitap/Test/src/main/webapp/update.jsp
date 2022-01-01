<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/31/2021
  Time: 1:16 PM
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
    <table>
        <tr>
            <th>
                ID
            </th>
            <th>
                NAME
            </th>
            <th>
                GENDER
            </th>
            <th>
                DATEOFBIRTH
            </th>
            <th>
                GRADES
            </th>
        </tr>
        <tr>
            <td><input type="text" value="${student.id}" name="id"></td>
            <td><input type="text"  value="${student.name}" name="name"></td>
            <td><input type="text" value="${student.gender}" name="gender"></td>
            <td><input type="text" value="${student.dateOfBirth}" name="dateOfBirth"></td>
            <td><input type="text" value="${student.grades}" name="grades"></td>
        </tr>
    </table>
    <input type="submit" value="update">
</form>
</body>
</html>
