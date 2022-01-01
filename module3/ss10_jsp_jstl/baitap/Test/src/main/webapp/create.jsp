<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/1/2022
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <td><input type="text" placeholder="ID" name="id"></td>
            <td><input type="text" placeholder="NAME"  name="name"></td>
            <td><input type="text" placeholder="GENDER" name="gender"></td>
            <td><input type="text" placeholder="DATEOFBIRTH"  name="dateOfBirth"></td>
            <td><input type="text" placeholder="GRAFES"  name="grades"></td>
        </tr>
    </table>
    <input type="submit" value="Create">
</form>
</body>
</html>
