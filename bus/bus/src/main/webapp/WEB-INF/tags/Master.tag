<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" required="true" rtexprvalue="true" %>
<%@ attribute name="header"%>
<%@ attribute name="content" fragment="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/styles/Menubar.css"
	style="width: 50%; height: 100%">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div
		style="postion: absoulate; top: 0px; left: 25%; highet: 10%; width: 100%">
		<img
			src="${pageContext.request.contextPath}/images/bus.jpg"
			style="width: 50%; height: 5%">
	</div>
	<div
		style="postion: absoulate; top: 20%; left: 25px; height: 8%; width: 100%">
		<ul>
			<li><a href="Bookticket">Book ticket</a></li>
			<li><a href="Updateprofile">Update profile</a></li>
			<li><a href="Cancelticke">Cancel ticket</a></li>
			<li style="float: right"><a class="active" href="Logout">Logout</a></li>
		</ul>



	</div>


<div 
style="position:absolute;top:43%;left:20%;height:100%;width:100%">
<jsp:invoke fragment="content"></jsp:invoke>
</div>




	

	
</body>