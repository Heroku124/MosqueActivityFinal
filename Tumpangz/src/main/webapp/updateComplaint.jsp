<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
   
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta name="viewport" content="width=device-width, initial-scale=1" />
                <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
                <title>Update Complaint</title>
            </head>

            <body>
               
                <div class="container"></div>
                <div class="container">
                    <br><br>
                    <h3>Edit Your Complaint</h3>
                    <br><br>
                     <form action="UpdateComplaintController" method="POST">
                        <div class="mb-3">
                            <label for="CID" class="form-label">Complaint ID</label>
                            <input type="text" class="form-control" id="CID" name="CID"  value="<c:out value="${complaint.CID}" />" readonly>
                        </div>
                        <div class="mb-3">
                            <label for="TumpangzID" class="form-label">Tumpangz ID</label>
                            <input type="text" class="form-control" id="TumpangzID" name="TumpangzID" value="<c:out value="${complaint.tumpangzID}" />"readonly>
                        </div>
                        <div class="mb-3">
                            <label for="IssueDesc" class="form-label">Issue Description</label>
                            <input type="text" class="form-control" id="IssueDesc" name="IssueDesc" value="<c:out value="${complaint.issueDesc}" />">
                        </div>
                        <div class="mb-3">
                           <label for="IssueTime" class="form-label">Issue time </label>
                           <input type="time" class="form-control" id="IssueTime" name="IssueTime" value="<c:out value="${complaint.issueTime}" />">
                        </div>
                        <div class="mb-3">
                            <label for="IssueDate" class="form-label">Issue Date</label>
                            <input type="date" class="form-control" id="IssueDate" name="IssueDate" value="<c:out value="${complaint.issueDate}" />">
                        </div>
                         <div class="mb-3">
                            <label for="RidePrice" class="form-label">Ride Price</label>
                            <input type="text" class="form-control" id="RidePrice" name="RidePrice" value="<c:out value="${complaint.ridePrice}" />">
                        </div>
                         <div class="mb-3">
                            <label for="PassengerNum" class="form-label">Passenger Number</label>
                            <input type="number" class="form-control" id="PassengerNum" name="PassengerNum" value="<c:out value="${complaint.passengerNum}" />">
                        </div>
                         <div class="mb-3">
                            <label for="PassengerNum" class="form-label">Driver Name</label>
                            <input type="text" class="form-control" id="DriverName" name="DriverName" value="<c:out value="${complaint.driverName}" />">
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
            