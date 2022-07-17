<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
           
       <!DOCTYPE html>
       <html lang="en" class="h-100">
	<head>
		<title>TumpangZ Complaint</title>
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
		bd-placeholder-img {
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
	      background-color: #0044AA00 ;
	      color: black;
	      border: 2px solid #4CAF50;
	      width: 250px;
	    }
	
	    .buttonSignin:hover {
	      background-color: #4CAF50;
	      color: white;
	    }
		#rcorner1 {
		border-radius: 10px;
		background-color: white;
		position: absolute;
		top: 180px;
	    left: 470px;
		width: 700px;
		border:3px solid #40DA61;
		height: inherit;
		padding: 50px;
		align-content: center;
	    }
		#rcorner2 {
		position: absolute;
		top:-35px;
		left: 700px;"
		}
		#rcorner3 {
		position: absolute;
		bottom:50px;
		left: 700px;"
		}
		h3 {
		font-family: "Segoe UI Light" ;
		}
		h1 {
		font-family: "Segoe UI Light" ;
		text-align: center;
		}
		p{
		font-family: "Gilroy" ;
		text-align: center;
		color: #44AA00 ;
		font-size: 70px;
		}
    </style>
    <link href="bootstrap css/cover/cover.css" rel="stylesheet">
    </head>
	<body class="d-flex h-100  text-dark bg-white">
	<div id="rcorner2">
    <img src="car1.png" width="245px" height="220px">
	</div>
	 <main class="px-3">
	 
	
		
		<div id="rcorner1">
		<h1>COMPLAINT DETAILS</h1><br><br>
		<h3>
		<table>
		<tr>
		<td style="width:40%">Complaint ID</td>
		<td>:&nbsp&nbsp&nbsp<c:out value="${complaint.CID}" /></td>
		</tr>
		<tr>
		<td>Tumpangz ID  </td>
		<td>:&nbsp&nbsp&nbsp<c:out value="${complaint.tumpangzID}" /></td>
		</tr>
		<tr>
		<td>Description of Issue </td>
		<td>:&nbsp&nbsp&nbsp<c:out value="${complaint.issueDesc}" /></td>
		</tr>
		<tr>
		<td >Number of passenger </td>
		<td>:&nbsp&nbsp&nbsp<c:out value="${complaint.passengerNum}" /></td>
		</tr>
		<tr>
		<td>Time of Ride </td>
		<td>:&nbsp&nbsp&nbsp<c:out value="${complaint.issueTime}" /></td>
		</tr>
		<tr>
		<td>Date of Ride </td>
		<td>:&nbsp&nbsp&nbsp<c:out value="${complaint.issueDate}" /></td>
		</tr>
		<tr>
	    <td >Total Price of Ride:  </td>
		<td>:&nbsp&nbsp&nbsp<c:out value="${complaint.ridePrice}" /></td>
		</tr>
		<tr>
		<td >Driver Name</td>
		<td>:&nbsp&nbsp&nbsp<c:out value="${complaint.driverName}" /></td>
		</tr>
		</table>
		</h3>
		</div>
		
	    <div id="rcorner3">
		<a  href="ListComplaintController" class="button buttonSignin">Home</a>
		</div>
	</main>
		
		
		
		
</body>
</html>
            