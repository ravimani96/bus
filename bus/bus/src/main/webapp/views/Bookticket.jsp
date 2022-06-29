<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="mp" tagdir="/WEB-INF/tags/"%>
<mp:Master title="Add Employees">



	<jsp:attribute name="header">
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: black;
}

* {
	box-sizing: border-box;
}

/* Add padding to containers */
.container {
	padding: 10px;
	background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 10px;
}

/* Set a style for the submit button */
.registerbtn {
	background-color: #04AA6D;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}

/* Add a blue text color to links */
a {
	color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>

</jsp:attribute>

	<jsp:attribute name="content">
<form action="bookingt">
  <div class="container">
    <h1>Book your Bus Now</h1>
    
    <hr>

<table style="width: 600px">
<tr>
<td>
		<label for="custid"><b>Customer Id</b></label>
    </td>
	<td>
     <input type="text" placeholder="Customer Id" name="custid"
							id="custid" required>
   
</td>
</tr>

<tr>

<td>
		<label for="From"><b>From</b></label>
    </td>
	<td>
     <input type="text" placeholder="From" name="From" id="From"
							required>
   
</td>

<td>
		<label for="To"><b>To</b></label>
    </td>
	<td>
     <input type="text" placeholder="To" name="To" id="TO"
							required>
   
</td>
</tr>

<tr>
<td>
		<label for="DOB"><b>Date of Booking</b></label>
    </td>
	<td>
     <input type="date" placeholder="DOB" name="DOB" id="DOB" required>
   
</td>
</tr>

<tr>
<td>
		<label for="DOT"><b>Date of Travel</b></label>
    </td>
	<td>
     <input type="date" placeholder="DOT" name="DOT" id="DOT" required>
   
</td>
</tr>

<tr>
<td>
		<label for="NOT"><b>Number Of Ticket</b></label>
    </td>
	<td>
     <input type="text" placeholder="NOT" name="NOT" id="NOT" required>
   
</td>
</tr>
<tr>
						<td></td>
						<td> &nbsp</td>
					</tr>
<tr>
						<td></td>
						<td> <button type="submit" class="registerbtn">submit</button></td>
					</tr>
</table>
		<s:out value="${msg}"></s:out>

</form>

	</jsp:attribute>

</mp:Master>

