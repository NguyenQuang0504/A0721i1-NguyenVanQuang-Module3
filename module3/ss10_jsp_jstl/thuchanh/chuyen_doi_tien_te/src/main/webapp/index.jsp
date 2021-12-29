<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/29/2021
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Ung dung chuyen doi tien te</h1>
  <form action="/transform_servlet" method="post">
    Ty gia: <input type="text" name="rate">
    USD: <input type="text" name="usd">
    <input type="submit" placeholder="Transform">
  </form>
  </body>
</html>
