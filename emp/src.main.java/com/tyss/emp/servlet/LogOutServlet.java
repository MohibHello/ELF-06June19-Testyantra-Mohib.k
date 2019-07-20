package com.tyss.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogOutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);

		if (session != null) {
			session.invalidate();
		}
		RequestDispatcher dispatcher = null;
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.print(
				"<h1><span style='color:red;text-align:center;margin:0 auto;'>Thanks for visting our site</span></h1>");
		dispatcher = req.getRequestDispatcher("emplogin.html");
		dispatcher.include(req, resp);
	}
}
