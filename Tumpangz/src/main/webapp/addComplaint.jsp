<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>Add Complaint</title>
    </head>

    <body>
       <div class="container">
                    
        </div>

        <div class="container">
            <br><br>
            <h3>Add New Complaint</h3>
            <br><br>
            <form action="AddComplaintController" method="POST">
                <div class="mb-3">
                    <label for="CID" class="form-label">Complaint ID</label>
                    <input type="text" class="form-control" id="CID" name="CID" placeholder="ENTER CID..">
                </div>
                <div class="mb-3">
                    <label for="TumpangzID" class="form-label">Tumpangz ID</label>
                    <input type="text" class="form-control" id="TumpangzID" name="TumpangzID" placeholder="ENTER TID.." value="TA01" />" readonly>
                </div>
                <div class="mb-3">
                    <label for="IssueDesc" class="form-label">Issue Description</label>
                    <input type="text" class="form-control" id="IssuDesc" name="IssueDesc" placeholder="ENTER Issue..">
                </div>
                <div class="mb-3">
                    <label for="IssueTime" class="form-label">Issue time </label>
                    <input type="time" class="form-control" id="IssueTime" name="IssueTime" placeholder="ENTER Time of issue..">
                </div>
                <div class="mb-3">
                    <label for="IssueDate" class="form-label">Issue Date</label>
                    <input type="date" class="form-control" id="IssueDate" name="IssueDate"placeholder="ENTER date of issue..">
                </div>
                <div class="mb-3">
                    <label for="RidePrice" class="form-label">Ride Price</label>
                    <input type="text" class="form-control" id="RidePrice" name="RidePrice" placeholder="Enter Price of ride..">
                </div>
                <div class="mb-3">
                    <label for="PassengerNum" class="form-label">Passenger Number</label>
                    <input type="number" class="form-control" id="PassengerNum" name="PassengerNum" placeholder="Enter passenger number..">
                </div>
                <div class="mb-3">
                 <div class="mb-3">
                    <label for="DriverName" class="form-label"> Driver name</label>
                    <input type="text" class="form-control" id="DriverName" name="DriverName" placeholder="ENTER driver's name.">
                </div>
				</div>
                <div class="mb-3">
                    <input type="submit" class="btn btn-primary" value="Submit">
                    <input type="reset" class="btn btn-primary" value="Reset">
                    <a href="ListComplaintController" class="btn btn-danger">Cancel</a>
                </div>
            </form>
        </div>

    </body> 

    </html>
        