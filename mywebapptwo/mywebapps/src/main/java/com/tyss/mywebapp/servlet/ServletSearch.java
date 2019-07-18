package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.beans.EmployeeInfoBean;
import com.testyantra.mywebapp.dao.EmployeeDAO;
import com.testyantra.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/search")
//@WebServlet("/search/employeesearch")
public class ServletSearch extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String idValue = req.getParameter("id");

		// Interact withDb & get the Employee Info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);

		// Send the Response to browser
		PrintWriter out = resp.getWriter();

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
			out.print("<h1><span style=\"color:green\">EmployeeFound !!!</span></h1>");
			out.print("<h3><br>");
			out.print("<br> ID 		        ---" + bean.getId());
			out.print("<br> NAME			    ---" + bean.getName());
			out.print("<br> AGE 			    ---" + bean.getAge());
			out.print("<br> GENDER			---" + bean.getGender());
			out.print("<br> SALARY  		    ---" + bean.getSalary());
			out.print("<br> PHONE  		  	---" + bean.getPhone());
			out.print("<br> JOINING_DATE	    ---" + bean.getJoiningDate());
			out.print("<br> ACCCOUNT_NUMBER   ---" + bean.getAccountNumber());
			out.print("<br> EMAIL  			---" + bean.getEmail());
			out.print("<br> DESIGNATION    ---" + bean.getDesignation());
			out.print("<br> DOB        		---" + bean.getDob());
			out.print("<br> DEPT_NO (FK)   	---" + bean.getDepartmentId());
			out.print("<br> MGR_ID			---" + bean.getManagerId());
			out.print("</h3>");
			out.print("<body>");
			out.print("<html>");

		}

		// get the object from
		ServletContext ctx = getServletContext();
		EmployeeInfoBean empInfo = (EmployeeInfoBean) ctx.getAttribute("employeeInfo");

		if (empInfo == null) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color:red\">EmployeeInfoBean not Found !!!</span></h1>");
			out.print("<br>");
			out.print("<body>");
			out.print("<html>");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color:green\">EmployeeInfoBean Found !!!</span></h1>");
			out.print("<h3><br>");
			out.print("<br> ID 		        ---" + empInfo.getId());
			out.print("<br> NAME			    ---" + empInfo.getName());
			out.print("<br> AGE 			    ---" + empInfo.getAge());
			out.print("<br> GENDER			---" + bean.getGender());
			out.print("<br> SALARY  		    ---" + bean.getSalary());
			out.print("<br> PHONE  		  	---" + bean.getPhone());
			out.print("<br> JOINING_DATE	    ---" + bean.getJoiningDate());
			out.print("<br> ACCCOUNT_NUMBER   ---" + bean.getAccountNumber());
			out.print("<br> EMAIL  			---" + empInfo.getEmail());
			out.print("<br> DESIGNATION    ---" + bean.getDesignation());
			out.print("<br> DOB        		---" + bean.getDob());
			out.print("<br> DEPT_NO (FK)   	---" + empInfo.getDepartmentId());
			out.print("<br> MGR_ID			---" + bean.getManagerId());
			out.print("</h3>");
			out.print("<body>");
			out.print("<html>");

		}
	}
}
