<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
		Cookie dummyCookie = new Cookie("dummyCookie", "checkCookieEnabled");
		response.addCookie(dummyCookie);

		if (request.getCookies() == null) {
			request.getrequestuestDispatcher("cookiesdisabled.html").include(request, response);
			return;
		}
%>
	<%! 	String idValue = request.getParameter("empid");%>
	<%! 	String password = request.getParameter("password1");%>
	 
		
		<%! EmployeeDAO dao = EmployeeDAOFactory.getInstance();%>
		<%! EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);

		// Send the responseonse to browser
		PrintWriter out = response.getWriter();
		String url;
		if (bean.getPassword().equals(password) && bean.getId() == Integer.parseInt(idValue)) {

			// Valid Credential ;create a Session
			HttpSession session = request.getSession();
			session.setAttribute("data", bean);
			url = "./login";

		requestuestDispatcher dispatcher = request.getrequestuestDispatcher(url);
			%>

	<!DOCTYPE html>
<html lang='en'>
<head>
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
								<input type='text' class='form-control' id='search'
									name='search' aria-label='Sizing example input'
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
			</form>
			<div class='col-md-1' style='margin-top: 10px;'>
				<a href='./logo'>
					<button type='button' class='btn btn-success btn-inline' id='btn'
						onclick='logout()'>
				</a> logout
				</button>
			</div>
		</div>
	</header>
	<section style='margin: 25%'>
		<h1>
			<span style=""'color:green\'>EmployeeFound !!!</span>
		</h1>
		<h3>
			<br> <br> ID ---
			<%= bean.getId() %>
			<br> NAME ---
			<%=bean.getName() %>
			<br> AGE ---
			<%= bean.getAge()%>
			<br> GENDER ---
			<%= bean.getGender()%>
			<br> SALARY ---
			<%= bean.getSalary()%>
			<br> PHONE ---
			<%= bean.getPhone()%>
			<br> JOINING_DATE ---
			<%= bean.getJoiningDate()%>
			<br> ACCCOUNT_NUMBER ---
			<%= bean.getAccountNumber()%>
			<br> EMAIL ---
			<%= bean.getEmail()%>
			<br> DESIGNATION ---
			<%= bean.getDesignation()%>
			<br> DOB ---<%= bean.getDob()%>
			<br> DEPT_NO (FK) ---<%= bean.getDepartmentId()%>
			<br> MGR_ID ---<%=bean.getManagerId()%>
		</h3>
	</section>
	<footer style='background: gray; width: 100%; height: 30px;'>
		footer details </footer>
	<script>
			  function logout() {
			   alert('logging out');
			    window.location.href='./logout'; }
			  </script>
	<% 
		} else {

			requestuestDispatcher dispatcher = null;
			response.setContentType("text/html");
			dispatcher = request.getrequestuestDispatcher("emplogin.html");
			dispatcher.include(request, response);
%>

<html>
<body>
	<script>
			   alert('Invalid password or id');
			  </script>
</body>
<html>
<% 
		}
%>

</body>
</html>