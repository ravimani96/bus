<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="mainpage">
		<table border="1">
			<tr>
				<td>userid</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="Password"></td>
			</tr>
			
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
		<s:out value="${MSG}"></s:out>
</body>
</html>