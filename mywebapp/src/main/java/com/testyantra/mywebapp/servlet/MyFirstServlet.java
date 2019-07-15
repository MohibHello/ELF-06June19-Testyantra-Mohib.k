package com.testyantra.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String currentDateTime = new Date().toString();

		String httpMethod = req.getMethod();
		String protocol = req.getProtocol();
		StringBuffer requestUrl = req.getRequestURL();

		System.out.println("Http Method ==>" + httpMethod);
		System.out.println("protocol====>" + protocol);
		System.out.println("URL ==>" + requestUrl);

		String fnameValue = req.getParameter("fname");
		String lnameValue = req.getParameter("lname");

		ServletContext ctx = getServletContext();
		String movie = ctx.getInitParameter("movie");

		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");

		String htmlResponse = "<!DOCTYPE html>" + "<html>" + "<head>" + "<meta charset=\"ISO-8859-1\">"
				+ "<title>MY First HTML</title>" + "</head>" + "<body>" + "	<h1>"
				+ "	Current date and Time is : <br />" + "	<span style=\"color:red\">" + currentDateTime + "</span>"
				+ "<br><br>" + "First Name :" + fnameValue + "<br><br>" + "Last Name :" + lnameValue + "moviename	:"
				+ movie + " " + "name :" + actorName + "</h1>" + "</body>" + "</html>";

		// Send the Above HTML Response to the Browser
		resp.setContentType("text/html");
		// resp.setHeader("Refresh", "1");
		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);

	}// End of doGet ()

}
