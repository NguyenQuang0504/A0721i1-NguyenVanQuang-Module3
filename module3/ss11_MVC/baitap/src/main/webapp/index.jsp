<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/1/2022
  Time: 6:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Customer</title>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/customer">

  <label> Text
    <input type="text" name="action"/>
  </label>
  <input type="submit">
</form>
</body>
</html>
