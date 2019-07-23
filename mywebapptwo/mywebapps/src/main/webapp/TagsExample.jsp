<%!
	public String name="asta";
private int age=50;
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Tags Example ...</title>
</head>
<body>
<%!
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
%>
<h1>JSP Tags Example .....</h1>
<br>
<h1>Name 1 : <%=name %> </h1> 
<h1>Name 2 : <%=getName() %> </h1>
<h1>Name 3 : <%=getName("rajiv") %> </h1>
<h1>Age : <%=age %> </h1>
<h1>Age 2 : <%=getAge() %> </h1>

<%
for(int i=0;i<5;i++)
{
%>
<h4>Name 1 : <%=name %> </h4> 
<%
}
%>

</body>
</html>

<%!
public String getName(String name) {
	return "Name Entered is:- "+name;
}
%>