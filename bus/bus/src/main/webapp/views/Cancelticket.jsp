<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="mp" tagdir="/WEB-INF/tags/"%>
<mp:Master title="Cancel Ticket" >



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
<form action="delete">
  <div class="container">
    <h1>Cancel Ticket</h1>
    
<hr>
<table style="width: 600px">
<tr>
<td>
<label for="dot"><b>Ticket Id</b></label>
</td>
<td>
<input type="text" placeholder="Ticket Id" name="tid"
							id="dot" required>  
</td>
</tr>
<td></td>
<td> 
<button type="submit" class="registerbtn">submit</button>
</td>
</tr>
</table>
<s:out value="${msg}"></s:out>

</div>
</form>

	</jsp:attribute>

</mp:Master>

