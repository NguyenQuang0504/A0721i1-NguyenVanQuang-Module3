<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/20/2022
  Time: 12:34 AM
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
<center>
 <h1 style="color: red; font-weight: 300;">Create Customer</h1>
    <h2>
        <c:out value="${mess}"></c:out>
    </h2>
    <form method="post">
 <div class="input-group flex-nowrap">
     <span class="input-group-text">Id</span>
     <input type="text" class="form-control" placeholder="Id" aria-label="Username" aria-describedby="addon-wrapping" name="id">
 </div>
 <div class="input-group flex-nowrap">
     <span class="input-group-text">Name</span>
     <input type="text" class="form-control" placeholder="Name" aria-label="Username" aria-describedby="addon-wrapping" name="name">
 </div>
 <div class="input-group flex-nowrap">
     <span class="input-group-text">DateOfBirth</span>
     <input type="date" class="form-control" placeholder="DateOfBirth" aria-label="Username" aria-describedby="addon-wrapping"name="dateOfBirth">
 </div>
 <div class="input-group flex-nowrap">
     <span class="input-group-text">Gender</span>
     <input type="text" class="form-control" placeholder="Gender" aria-label="Username" aria-describedby="addon-wrapping" name="gender">
 </div>
 <div class="input-group flex-nowrap">
     <span class="input-group-text">Cmnd</span>
     <input type="text" class="form-control" placeholder="CMND" aria-label="Username" aria-describedby="addon-wrapping" name="cmnd">
 </div>
 <div class="input-group flex-nowrap">
     <span class="input-group-text">Phone Number</span>
     <input type="text" class="form-control" placeholder="PhoneNumber" aria-label="Username" aria-describedby="addon-wrapping" name="phoneNumber" value="${phone}">
 </div>
 <div class="input-group flex-nowrap">
     <span class="input-group-text" >Email</span>
     <input type="text" class="form-control" placeholder="Email" aria-label="Username" aria-describedby="addon-wrapping" name="email">
 </div>
 <div class="input-group flex-nowrap">
     <span class="input-group-text">Address</span>
     <input type="text" class="form-control" placeholder="Address" aria-label="Username" aria-describedby="addon-wrapping" name="address">
 </div>
 <div class="input-group flex-nowrap">
     <span class="input-group-text">CustomerType</span>
     <select name="idCustomerType">
         <c:forEach var="customertype" items="${list}">
             <option value="${customertype.id}">
                 <c:out value="${customertype.nameCustomerType}"></c:out>
             </option>
         </c:forEach>
     </select>
 </div>
        <div class="d-grid gap-2">
            <button class="btn btn-primary" type="submit" style="width: 100%; margin-top: 20px">Create New Customer</button>
        </div>
    </form>
</center>
</body>
</html>
