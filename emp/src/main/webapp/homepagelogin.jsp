<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.login-box {
	height: 50%;
	width: 30%;
	border: 1px solid grey;
	margin-left: 35%;
	margin-top: 10%;
	position: relative;
	box-shadow: 21px 12px 24px 10px rgba(0, 0, 0, .5);
	background: #dadada;
}

.login-header {
	text-align: center;
	font-family: "vardhana", cursive;
	font-size: 35px;
	background: linear-gradient(to bottom, #00bfff 0%, #0000ff 100%);
	color: #fff;
	position: relative;
	box-shadow: 1px 3px 14px rgba(0, 0, 0, .5);
}

.login-body {
	padding: 20px;
	line-height: 2;
}
</style>
<body>

	<div class="login-box">
		<div class="login-header">Login</div>
		<div class="login-body">
			<form class="form-group">
				<label>Username</label> <input type="text" class="form-control"
					name=""> <label>Password</label> <input type="password"
					class="form-control" name=""> <input type="checkbox"
					value="checked"><b>Remember</b> <input type="submit"
					value="Login" class="form-control btn btn-success " name="">
			</form>
		</div>
	</div>
</body>
</html>