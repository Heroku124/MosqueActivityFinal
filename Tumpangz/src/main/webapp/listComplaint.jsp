<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
            <!doctype html>
<html lang="en" class="h-100">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
  <meta name="generator" content="Hugo 0.88.1">
  <title>Tumpanmgz Customer Complaint System</title>

  <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/cover/">



  <!-- Bootstrap core CSS -->
  <link href="dist/css/bootstrap.min.css" rel="stylesheet">

  <style>
    .bd-placeholder-img {
      font-size: 1.125rem;
      text-anchor: middle;
      -webkit-user-select: none;
      -moz-user-select: none;
      user-select: none;
    }

    @media (min-width: 768px) {
      .bd-placeholder-img-lg {
        font-size: 3.5rem;
      }
    }

    .button {
      border: none;
      color: white;
      padding: 16px 32px;
      text-align: center;
      text-decoration: none;
      display: inline-block;
      font-size: 16px;
      margin: 12px 2px;
      transition-duration: 0.4s;
      cursor: pointer;
    }

    .buttonSignin {
      background-color: white;
      color: black;
      border: 2px solid #4CAF50;
      width: 250px;
    }
    #rcorner2 {
		position: absolute;
		top:-35px;
		left: 700px;"
	}

    .buttonSignin:hover {
      background-color: #4CAF50;
      color: white;
    }

    .buttonRegister {
      background-color: white;
      color: black;
      border: 2px solid #4CAF50;
      width: 250px;
    }

    .buttonRegister:hover {
      background-color: #4CAF50;
      color: white;
    }
    .contain{
     position: absolute;
     top: 100px;
     left: 200px;
    }

    h1 {
      text-align: center;
    }
  </style>

  <!-- Custom styles for this template -->
  <link href="bootstrap css/cover/cover.css" rel="stylesheet">
</head>

<body class="d-flex h-100 text-center text-dark bg-white">


<div class="container">
  
    <header class="mb-auto">
      <div>
      </div>
    </header>
    
    <main class="px-3">
                    <br> 
                    <div class="container">
				    <img src="car1.png" width="245px" height="220px">
					</div>
                    <br>
                    <h3>Your Complaints</h3>
                     <a  href="addComplaint.jsp" class="button buttonSignin" style="float: left">Add New Complaint</a>
                    <br><br> <br>
                    
                    <br>
                    <table class="table table-striped" style="width: 105%">
                        <tr>
                            <th>Complaint Id</th>
                            <th>Tumpangz Id</th>
                            <th>Issue Description</th>
                            <th>Issue Time</th>
                            <th>Issue Date</th>
                            <th>Passenger Number</th>
                            <th>Ride Total Price</th>
                            <th>Driver Name</th>
                            <th colspan="3">Actions</th>
                        </tr>
                        <c:forEach items="${complaints}" var="complaint" varStatus="complaints">
                            <tr>
                                <td>
                                    <c:out value="${complaint.CID}" />
                                </td>
                                <td>
                                    <c:out value="${complaint.tumpangzID}" />
                                </td>
                                <td>
                                    <c:out value="${complaint.issueDesc}" />
                                </td>
                                <td>
                                    <c:out value="${complaint.issueTime}" />
                                </td>
                                <td>
                                    <c:out value="${complaint.issueDate}" />
                                </td>
                                 <td>
                                    <c:out value="${complaint.passengerNum}" />
                                </td>
                                 <td>
                                    <fmt:formatNumber value = "${complaint.ridePrice}" type = "currency"/>
                                </td>
                                 <td>
                                    <c:out value="${complaint.driverName}" />
                                </td>
                                
                                <td><a href="ViewComplaintController?CID=<c:out value="${complaint.CID}" />"
                                    class="btn btn-warning">View</a></td>
                                <td><a href="UpdateComplaintController?CID=<c:out value="${complaint.CID}" />"
                                    class="btn btn-primary">Edit</a></td>
                                <td><a href="DeleteComplaintController?CID=<c:out value="${complaint.CID}" />"
                                    class="btn btn-danger" onclick="return confirm('Are you sure you want to delete this?')">Delete</a></td>
                               
                        </c:forEach>
                    </table>
                 </div>
                
                <script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
                 </main>
               
            </body>

            </html>