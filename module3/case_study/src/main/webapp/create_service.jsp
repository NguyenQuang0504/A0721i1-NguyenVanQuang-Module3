<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/21/2022
  Time: 1:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form class="row g-3 container" method="post">
    <div class="col-md-6">
        <label class="form-label">City</label>
        <input type="text" class="form-control">
    </div>
    <div class="col-md-4">
        <label class="form-label">City</label>
        <input type="text" class="form-control">
    </div>
    <div class="col-md-2">
        <label  class="form-label">Zip</label>
        <input type="text" class="form-control">
    </div>
    <div class="col-12">
        <label class="form-label">Address</label>
        <input type="text" class="form-control" placeholder="1234 Main St">
    </div>
    <div class="col-12">
        <label class="form-label">Address 2</label>
        <input type="text" class="form-control" placeholder="Apartment, studio, or floor">
    </div>
    <div class="col-md-6">
        <label class="form-label">City</label>
        <input type="text" class="form-control">
    </div>
    <div class="col-md-4">
        <label class="form-label">City</label>
        <input type="text" class="form-control">
    </div>
    <div class="col-md-2">
        <label class="form-label">Zip</label>
        <input type="text" class="form-control">
    </div>
    <div class="col-md-6">
        <label class="form-label">City</label>
        <input type="text" class="form-control">
    </div>
    <div class="col-md-4">
        <label  class="form-label">City</label>
        <input type="text" class="form-control">
    </div>
    <div class="col-md-2">
        <label  class="form-label">Zip</label>
        <input type="text" class="form-control">
    </div>
    <div class="col-12">
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="gridCheck">
            <label class="form-check-label" for="gridCheck">
                Check me out
            </label>
        </div>
    </div>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
</form>
</body>
</html>
