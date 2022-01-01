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
    <title>Find Product</title>
</head>
<body>
<h1> Find Product </h1>
<a href="${pageContext.request.contextPath}/products">Back to product list</a>

<form method="post">
    <label> Name Product:
        <input type="text" name="name"/>
    </label>
    <input type="submit" value="Submit">
    <%--    <c:if test="${product!=null}">--%>
    <%--            <p><c:out value="${product}"/></p>--%>
    <%--    </c:if>--%>

</form>
</body>
</html>