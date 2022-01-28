<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/26/2022
  Time: 7:20 PM
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
    <span>Ma MB</span> <input type="text" placeholder="Ma_mb" name="ma_mb">
    <span>Dien tich</span> <input type="text" placeholder="Dien tich" name="dien_tich">
    <span>Trang thai</span>
    <select name="id_trangthai" >
        <c:forEach var="trangthai" items="${list1}">
            <option value="${trangthai.ma_tt}">
                <c:out value="${trangthai.name_tt}"></c:out>
            </option>
        </c:forEach>
    </select>
    <span>Tang</span> <input type="text" placeholder="Tang" name="tang">
    <span>Loai Van Phong</span>
    <select name="id_loaimb" >
        <c:forEach var="loaimb" items="${list}">
            <option value="${loaimb.ma_lmb}">
                <c:out value="${loaimb.name_lmb}"></c:out>
            </option>
        </c:forEach>
    </select>
    <span>Tien</span><input type="text"name="gia">
    <span>Ngay bat dau</span><input type="date" name="ngaybd">
    <span>Ngay ket thuc</span><input type="date" name="ngaykt">
    <button type="submit"> Create </button>
    <button>Huy</button>
</form>
</body>
</html>
