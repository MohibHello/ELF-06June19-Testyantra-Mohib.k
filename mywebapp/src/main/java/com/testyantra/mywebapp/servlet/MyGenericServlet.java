package com.testyantra.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mygeneric", initParams = { @WebInitParam(name = "actress", value = "basanthi") })
public class MyGenericServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext ctx = getServletContext();
		String movie = ctx.getInitParameter("movie");

		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");
		String actressName = config.getInitParameter("actress");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("hello to you sir =>" + movie + " actor :" + actorName);
		out.println("<br>");
		out.println("actress :" + actressName + "<br>");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}