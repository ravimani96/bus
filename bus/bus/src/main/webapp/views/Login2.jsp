<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
	
<script type="text/javascript">
	function Validate() {
		var u = document.getElementsByName("username")[0].value;
		var p = document.getElementsByName("password")[0].value;
		//alert(u.length);
		if (u.length == 0 || p.length == 0) {
			alert("please enter username/password");
			return false;
		}
		return true;
	}
</script>

</head>
<body>

	<section class="vh-100" style="background-color: white;">

		<div class="container pt-6 h-300  h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col col-xl-10">
					<div class="card" style="border-radius: 1rem;">
						<div class="row g-0">
							<div class="col-md-6 col-lg-5 d-none d-md-block">
								<img
									src="https://th.bing.com/th/id/R.385c69501017a881568e9b446ca01ec1?rik=j5cOsr1%2bhGNj2g&riu=http%3a%2f%2fwallpapershome.com%2fimages%2fpages%2fpic_v%2f9771.jpg&ehk=SY5O9BsEyqhtHAvn6l2AiLNZpIfCCgGhVWlIpyZKm1o%3d&risl=&pid=ImgRaw&r=0"
									alt="login form" class="img-fluid"
									style="border-radius: 1rem 0 0 1rem;" />
							</div>


							<div class="col-md-6 col-lg-7 d-flex align-items-center">
								<div class="card-body p-4 p-lg-5 text-black">

									<form action="mainpage">

										<div class="d-flex align-items-center mb-3 pb-1">
											<i class="fas fa-cubes fa-2x me-3" style="color: black;"></i>
											<span class="h1 fw-bold mb-0" style="color: red;">7
												Wonder's Bus Booking</span>

										</div>

										<h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign
											into your account</h5>

										
										<table >
			<tr>
				<td class="p-3 form-label">userid</td>
				<td><input class="form-control form-control-lg" type="text" name="username"></td>
			</tr>
			<tr>
				<td class="p-3 form-label">password</td>
				<td><input class=" form-control form-control-lg" type="text" name="Password"></td>
			</tr>
			
			<tr>
				<td><input type="submit" class="p-1 m-4 btn btn-dark btn-lg btn-block " 
												onclick="return Validate()"></td>
			</tr>
		</table>
										
										<s:out value="${msg}"></s:out>
									</form>
									<form action="register">
										<p class="mb-5 pb-lg-2" style="color: blue;">
											Don't have an account? <a href="/register"
												style="color: red;">Register here</a>
										</p>

									</form>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>


</body>
</html>