package com.testyantra.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.beans.EmployeeInfoBean;
import com.testyantra.mywebapp.dao.EmployeeDAO;
import com.testyantra.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/search")
public class ServletSearch extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String idValue = req.getParameter("id");

		// Interact withDb & get the Employee Info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);

		// Send the Response to browser

		if (bean == null) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color:red\">Employee not Found !!!</span></h1>");
			out.print("<br>");
			out.print("<body>");
			out.print("<html>");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color:green\">Employee Found !!!</span></h1>");
			out.print("<h3><br>");
			out.print("<br> ID &nbsp;&nbsp;&nbsp;" + bean.getId());
			out.print("<br> NAME&nbsp;&nbsp;&nbsp;" + bean.getName());
			out.print("<br> AGE&nbsp;&nbsp;&nbsp;" + bean.getAge());
			out.print("<br> GENDER &nbsp;&nbsp;&nbsp;" + bean.getGender());
			out.print("<br> SALARY &nbsp;&nbsp;&nbsp;" + bean.getSalary());
			out.print("<br> PHONE&nbsp;&nbsp;&nbsp;" + bean.getPhone());
			out.print("<br> JOINING_DATE&nbsp;&nbsp;&nbsp;" + bean.getJoiningDate());
			out.print("<br> ACCCOUNT_NUMBER&nbsp;&nbsp;&nbsp;" + bean.getAccountNumber());
			out.print("<br> EMAIL&nbsp;&nbsp;&nbsp;" + bean.getEmail());
			out.print("<br> DESIGNATION&nbsp;&nbsp;&nbsp;" + bean.getDesignation());
			out.print("<br> DOB&nbsp;&nbsp;&nbsp;" + bean.getDob());
			out.print("<br> DEPT_NO (FK)&nbsp;&nbsp;&nbsp;" + bean.getDepartmentId());
			out.print("<br> MGR_ID&nbsp;&nbsp;&nbsp;" + bean.getManagerId());
			out.print("</h3>");
			out.print("<body>");
			out.print("<html>");
		}
	}
}
