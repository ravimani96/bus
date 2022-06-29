<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function getuserid() {
var uid=document.getElementsByName("custid")[0].value;
window.location.href="/Updatefileq/"+uid;
}
</script>
</head>
<body>
<form action="/saveupdate">
<table>
<tr>
<td>CustomerId</td>
<td><input type="text" name="custid" onblur="getuserid();" value="${values.custid}">
<td>
</tr>
<tr>
<td>CustomerName</td>
<td><input type="text" name="name" value="${values.name}">
<td>
</tr>

<tr>
<td>CustomerAddress</td>
<td><input type="text" name="address" value="${values.address}">
<td>
</tr>

<tr>
<td>City</td>
<td><input type="text" name="city" value="${values.city}">
<td>
</tr>

<tr>
<td>State</td>
<td><input type="text" name="state" value="${values.state}">
<td>
</tr>

<tr>
<td>Country</td>
<td><input type="text" name="country" value="${values.country}">
<td>
</tr>
<tr>
<td>PinCode</td>
<td><input type="text" name="pincode" value="${values.pincode}">
<td>
</tr>

<tr>
<td>E-mail</td>
<td><input type="text" name="email" value="${values.email}">
<td>
</tr>

<tr>
<td>Gender</td>
<td><input type="text" name="gender" value="${values.gender}">
<td>
</tr>

<tr>
<td>Contact-No</td>
<td><input type="text" name="contactno" value="${values.contactno}">
<td>
</tr>

<%-- <tr>
<td>DateofBirth</td>
<td><input type="text" name="dateofbirth" value="${values.dateofbirth}">
<td>
</tr> --%>

<tr>
<td>CustomerType</td>
<td><input type="text" name="customertype" value="${values.customertype}">
<td>
</tr>

<tr>
<td>Password</td>
<td><input type="text" name="password" value="${values.password}">
<td>
</tr>


</table>
<input type="submit" value="update user">
</form>
<s:out value="${msg}"></s:out>
</body>
</html>

