package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] receiveCookies = req.getCookies();

		PrintWriter out = resp.getWriter();

		if (receiveCookies == null) {
			out.print("Cookies are Not Present !!!");
		} else {
			out.print("Cookies are Present...");
		}
		for (Cookie cookie : receiveCookies) {

			out.println("cookie Name: " + cookie.getName());
			out.println("cookie Value: " + cookie.getValue());

		}

	}// end of get
}// End of class
