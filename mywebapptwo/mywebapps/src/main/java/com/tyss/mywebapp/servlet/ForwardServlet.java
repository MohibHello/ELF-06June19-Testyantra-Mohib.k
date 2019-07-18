package com.tyss.mywebapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.beans.EmployeeInfoBean;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(202);
		empInfo.setName("jack");
		empInfo.setAge(23);
		empInfo.setDepartmentId(404);
		empInfo.setEmail("jackle@gmail.com");
		req.setAttribute("employeeInfo", empInfo);

		// pass above object to Searchservlet
		ServletContext ctx = getServletContext();
		ctx.setAttribute("employeeInfo", empInfo);

		String url = "search?id=101";
		// forward only internal resource
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);

	}
}
