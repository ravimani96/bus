<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<form>
  <div class="container">
    <h1>Update profile</h1>
    
    <hr>

<table style="width: 600px">
<tr>
						<td>
		<label for="Name"><b>Name</b></label>
    </td>
						<td>
     <input type="text" placeholder="Enter Name" name="Name" id="Name"
							required>
   
    </td>
					</tr>
    <tr>
    <td>
    <label for="Address"><b>Address</b></label>
    
    </td>
    <td>
    <input type="text" placeholder="Enter Address" name="Address"
							id="Address" required>
    
    </td>
    </tr>
    
    </td>
					</tr>
    <tr>
    <td>
     <label for="city"><b>City Name</b></label>
    
    </td>
    <td>
   <input type="text" placeholder="Enter city" name="city" id="city"
							required>
    
    </td>
    </tr>
    
    
    </td>
					</tr>
    <tr>
    <td>
     <label for="state"><b>state</b></label>
    
    </td>
    <td>
   <input type="text" placeholder="Enter state" name="state" id="state"
							required>
    
    </td>
    </tr>
    
    
      </td>
					</tr>
    <tr>
    <td>
       <label for="country"><b>country Name</b></label>
    
    </td>
    <td>
   <input type="text" placeholder="Enter country" name="country"
							id="country" required>
    
    </td>
    </tr>
    
    
      </td>
					</tr>
    <tr>
    <td>
     <label for="pinCode"><b>pinCode</b></label>
    
    </td>
    <td>
    <input type="text" placeholder="Enter pinCode" name="pinCode"
							id="pinCode" required>
    
    </td>
    </tr>
    
    
    
      </td>
					</tr>
    <tr>
    <td>
<label for="email"><b>Email</b></label>    
    </td>
    <td>
     <input type="text" placeholder="Enter Email" name="email"
							id="email" required>
    
    </td>
    </tr>
    
    
    
      </td>
					</tr>
    <tr>
    <td>
    <label for="contactNo"><b>contactNo</b></label>
    
    </td>
    <td>
    <input type="text" placeholder="Enter contact No" name="contactNo"
							id="contactNo" required>
    
    </td>
    </tr>
    
    </td>
					</tr>
    <tr>
    <td>
    <label for="DOB"><b>DOB</b></label>
    
    </td>
    <td>
    <input type="text" placeholder="Enter DOB" name="DOB" id="DOB"
							required>
    
    </td>
    </tr>
    
    </td>
					</tr>
    <tr>
    <td>
   <label for="CustomerType"><b>CustomerType</b></label>
    
    </td>
    <td>
    <input type="text" placeholder="Enter Customer Type"
							name="CustomerType" id="CustomerType" required>
    
    </td>
    </tr>
    
    </td>
					</tr>
    <tr>
    <td>
 <label for="password"><b>Password</b></label>    
    </td>
    <td>
    <input type="password" placeholder="Enter Password" name="password"
							id="password" required>
    
    </td>
    </tr>
<!-- <tr><td></td><td> &nbsp</td></tr> -->    
<tr><td></td><td> <button  type="submit" class="registerbtn">Update</button></td></tr>
   
</table>


  </div>

  <div class="container signin">
    
  </div>
</form>
</jsp:attribute>
</mp:Master>