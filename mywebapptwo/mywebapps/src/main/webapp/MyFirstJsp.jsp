<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>
	<h1>
		Current date and Time is :
		<%
		String currrentDateTime = new Date().toString();
	%>

		<br> <br> <br> <span style="color: red;"><%=currrentDateTime%></span>
	</h1>
</body>
</html>