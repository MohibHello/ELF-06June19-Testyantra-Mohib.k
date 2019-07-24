<!DOCTYPE html>
<html lang="en">
<head>


<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Management Portal</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body style="background: cornflowerblue">


	<div class="container "
		style="margin: 5% 20% 0 15%; border-radius: 100px; background: #D3D3D3;">
		<div class="row justify-content-md-center">
			<div class="col-sm-5">
				<legend style="text-align: center;">Employee Login</legend>
				<form onSubmit="return checkPassword(this)" method="post"
					action="./login">
					<h4 style="color:red; display:block; margin:0 auto;"><%=request.getParameter("msg") %></h4>
					<div class="form-group">
						<label for="exampleInputEmail1">Employee ID</label> <input
							type="empid" class="form-control" id="empid" name="empid"
							aria-describedby="empidHelp" placeholder="Enter empid"
							required="required">
					</div>
					<div class="form-group">
						<label for="InputPassword">Password</label> <input type="password"
							class="form-control" name="password1" id="InputPassword"
							placeholder="Enter Password" required="required">
					</div>
					<div class="form-group">
						<label for="confirmPassword">Confirm Password</label> <input
							type="password" class="form-control" name="password2"
							id="confirmPassword" placeholder="Confirm Password"
							required="required">
					</div>
					<div class="text-center col-sm-12">
						<button type="submit" class="btn btn-primary">
							<small>Login</small>
						</button>
					</div>


				</form>
				<div class="text-center col-sm-12"
					style="margin-top: 10px; margin-bottom: 10px;">
					<a href="Employee Information.html"
						style="text-align: center; margin: 10px;" class="btn btn-primary"
						type="button"><small>Create Account</small></a> <a
						href="forgotpassword.html" class="btn btn-primary"
						style="text-align: center; margin: 10px;" type="button"><small>Forgot
							password</small></a>
				</div>

			</div>
		</div>
	</div>


</body>

<script>
	// Function to check Whether both passwords 
	// is same or not. 
	function checkPassword(form) {
		password1 = form.password1.value;
		password2 = form.password2.value;

		if (password1 != password2) {
			alert("\nPassword did not match: Please try again...")
			return false;
		}
	}
</script>

</html>