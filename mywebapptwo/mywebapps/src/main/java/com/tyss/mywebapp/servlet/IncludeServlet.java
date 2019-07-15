package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludeServlet
 */
public class IncludeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("1111111111");
		out.println("2222222222");

		dispatcher = request.getRequestDispatcher("hyperlink.html");
		dispatcher.include(request, response);
		out.print("<br>");
		out.println("3333333333");
		out.print("<br>");
		dispatcher = request.getRequestDispatcher("search?id=101");
		dispatcher.include(request, response);

		out.println("4444444444");
		out.print("<br>");

	}

}
