<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<link
		href='//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'
		rel='stylesheet'>
	<link href='//www.fuelcdn.com/fuelux/3.13.0/css/fuelux.min.css'
		rel='stylesheet'>
	<meta charset='UTF-8'>
	<meta name='viewport' content='width=device-width, initial-scale=1.0'>
	<meta http-equiv='X-UA-Compatible' content='ie=edge'>

	<link rel='stylesheet'
		href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'
		integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T'
		crossorigin='anonymous'>
	<title>Document</title>
</head>
<body>
	<header class='container-fluid'>
		<div class='row' style='background: gray; margin-bottom: 10px;'>
			<div class='col-sm-1' style='margin-top: 10px;'>
				<img class='rounded-circle' alt='Bootstrap Image Preview'
					style='height: 50px; width: 50px'
					src='https://www.layoutit.com/img/sports-q-c-140-140-3.jpg' />
			</div>
			<form method='get' action='./empsearch'>
				<div class='col-sm-10' style='margin-top: 10px;'>
					<div class='form-group'>
						<label class='control-label' for='searchInput'></label>
						<div class='col-md-12'>
							<div class='search input-group' data-initialize='search'
								role='search' id='search'>
								<input type='text' class='form-control'
									aria-label='Sizing example input' name='search'
									aria-describedby='inputGroup-sizing-default'> <span
									class='input-group-btn'>
									<button class='btn btn-default' type='submit'>
										<span class='glyphicon glyphicon-search'></span> <span
											class='sr-only'>Search</span>
									</button>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class='col-md-1' style='margin-top: 10px;'>
					<button type='button' class='btn btn-success btn-inline' id='btn'
						onclick='logout()'>logout</button>
				</div>
		</div>
		</form>
	</header>

	<center>
		<section style='margin-top: 10%'>
			<h1>
				<span style=""'color:green\'>EmployeeFound !!!</span>
			</h1>
			<h3>
				<br> for (EmployeeInfoBean InfoBean : bean) { %><a
					href='./display?eid=" + InfoBean.getId() + "'> <br>
					ID&nbsp;&nbsp;&nbsp;" + InfoBean.getId());
					--->Name&nbsp;&nbsp;&nbsp;" + InfoBean.getName());
				</a> }
	</center>
	</h3>
	</section>
	<footer style='background: gray; width: 100%; height: 30px;'>
		footer details </footer>
</body>
<script>
			  function logout() {
			   alert('logging out');
			    window.location.href='./logout'; }

			  </script>
</html>




</body>
</html>