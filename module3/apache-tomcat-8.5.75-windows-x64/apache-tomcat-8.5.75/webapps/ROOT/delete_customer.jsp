<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/20/2022
  Time: 6:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
</head>
<body>
<form method="post">
<select style="width: 100%;" class="form-select form-select-sm" aria-label=".form-select-sm example" name="id">
    <option selected>Open this select menu</option>
    <c:forEach var="customer" items="${listCustomer}">
        <option value="${customer.id}">
            <c:out value="${customer.name}"></c:out>
        </option>
    </c:forEach>
</select>
    <div class="d-grid gap-2">
        <button style="width: 100%" id="button" class="btn btn-primary" onclick="display()">Delete Customer</button>
    </div>
</form>
</body>
<script>
   function display(){
      let check = confirm("Ban co muon xoa");
       if (check){
           document.getElementById("button").type = "submit";
       }
   }
</script>
</html>
