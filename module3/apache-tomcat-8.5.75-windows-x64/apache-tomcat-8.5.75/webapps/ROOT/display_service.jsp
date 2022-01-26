<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/21/2022
  Time: 12:28 AM
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
    <link rel="stylesheet" href="style.css">
    <style>
        table{
            margin-bottom:  30px;
            margin-top: 30px;
            border: 1px solid black;
        }
    </style>
</head>
<body>
<div>
    <div class="container-fluid header">
        <nav class="navbar navbar-expand-lg navbar-light">
            <div class="container-fluid">
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon">
            </span>
                </button>
                <a class="navbar-brand" href="#">Home</a>
                <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/ServiceServlet?action=display">Service</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/ServiceServlet?action=create">Create New Service</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/ServiceServlet?action=delete">Delete Service</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/ServiceServlet?action=update">Update Service</a>
                        </li>
                    </ul>
                    <form class="d-flex" method="post" action="/ServiceServlet">
                        <input type="hidden" name="action" value="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="name">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
    </div>
    <div id="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-2 col-xs-0 content-left " style="background-color: #b3ffe2">
                    <div class="list-item">
                        <ul>
                            <li><a href="/ServiceServlet?action=home">HOME</a></li>
                        </ul>
                        <ul>
                            <li><a href="/CaseStudy?action=display">CUSTOMER</a></li>
                        </ul>
                        <ul>
                            <li><a href="/EmployeeServlet?action=display">EMPLOYEE</a></li>
                        </ul>
                        <ul>
                            <li><a href="">CONTRACT</a></li>
                        </ul>
                        <ul>
                            <li><a href="/ServiceServlet?action=display">SERVICE</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-10 col-xs-12 content-right" style="background-color: #b3ffe2">
                    <h1 style="text-align: center; color: red; margin-top: 10px; font-weight: 300">List Service</h1>
                    <table class="table table-dark table-hover">
                        <thead>
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Name</th>
                            <th scope="col">Area</th>
                            <th scope="col">Cost</th>
                            <th scope="col">Standard</th>
                            <th scope="col">Convenient</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="customer" items="${list}">
                            <tr>
                                <td>
                                    <c:out value="${customer.id}"></c:out>
                                </td>
                                <td>
                                    <c:out value="${customer.name}"></c:out>
                                </td>
                                <td>
                                    <c:out value="${customer.area}"></c:out>
                                </td>
                                <td>
                                    <c:out value="${customer.cost}"></c:out>
                                </td>
                                <td>
                                    <c:out value="${customer.standard}"></c:out>
                                </td>
                                <td>
                                    <c:out value="${customer.convinient}"></c:out>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="footer">

    </div>
</div>
</body>
</html>
