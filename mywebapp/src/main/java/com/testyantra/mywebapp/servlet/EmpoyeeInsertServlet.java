package com.testyantra.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.beans.EmployeeInfoBean;
import com.testyantra.mywebapp.dao.EmployeeDAO;
import com.testyantra.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/insert")
public class EmpoyeeInsertServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeInfoBean empinf = new EmployeeInfoBean();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		try {

			empinf.setId(Integer.parseInt(req.getParameter("id")));
			empinf.setName(req.getParameter("name"));
			empinf.setAge(Integer.parseInt(req.getParameter("age")));
			empinf.setAccountNumber(Long.parseLong(req.getParameter("accountnumber")));
			empinf.setDepartmentId(Integer.parseInt(req.getParameter("deptid")));
			empinf.setDesignation(req.getParameter("designation"));
			empinf.setDob(format.parse(req.getParameter("dob")));
			empinf.setJoiningDate(format.parse(req.getParameter("joiningdate")));
			empinf.setEmail(req.getParameter("email"));
			empinf.setGender(req.getParameter("gender"));
			empinf.setManagerId(Integer.parseInt(req.getParameter("mgrid")));
			empinf.setSalary(Double.parseDouble(req.getParameter("salary")));
			empinf.setPhone(Long.parseLong(req.getParameter("phone")));

			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			boolean result = dao.createEmployeeInfo(empinf);

			PrintWriter out = resp.getWriter();

			if (result) {
				out.print("Employee info inserted");
			} else {
				out.print("Employee info not inserted");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
