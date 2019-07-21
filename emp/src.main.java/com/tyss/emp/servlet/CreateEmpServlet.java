package com.tyss.emp.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOFactory;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;

@Log
@WebServlet("/create")
public class CreateEmpServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean empinf = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date joiningDate;
		Date dobDate;
		try {
			joiningDate = format.parse(req.getParameter("joining"));
			dobDate = format.parse(req.getParameter("dob"));
			empinf.setDob(dobDate);
			empinf.setJoiningDate(joiningDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		empinf.setId(Integer.parseInt(req.getParameter("id")));
		empinf.setName(req.getParameter("name"));
		empinf.setAge(Integer.parseInt(req.getParameter("age")));
		empinf.setAccountNumber(Integer.parseInt(req.getParameter("accountnumber")));
		empinf.setDepartmentId(Integer.parseInt(req.getParameter("deptid")));
		empinf.setDesignation(req.getParameter("designation"));

		empinf.setEmail(req.getParameter("email"));
		empinf.setGender(req.getParameter("gender"));
		empinf.setManagerId(Integer.parseInt(req.getParameter("managerid")));
		empinf.setSalary(Integer.parseInt(req.getParameter("salary")));
		empinf.setPhone(Long.parseLong(req.getParameter("phonenumber")));
		empinf.setPassword(req.getParameter("password1"));

		EmployeeOtherInfoBean empOtherinfo = new EmployeeOtherInfoBean();
		empOtherinfo.setAdhar(Integer.parseInt(req.getParameter("adhar")));
		empOtherinfo.setBloodGroup(req.getParameter("bloodGroup"));
		empOtherinfo.setEmergencyContactNumber(Integer.parseInt(req.getParameter("emergencyContactNumber")));
		empOtherinfo.setEmergencyContactPerson(req.getParameter("emergencyContactPerson"));
		empOtherinfo.setFatherName(req.getParameter("fatherName"));
		empOtherinfo.setId(Integer.parseInt(req.getParameter("id2")));
		empOtherinfo.setIschallenged(Boolean.parseBoolean(req.getParameter("ischallenged")));
		empOtherinfo.setMarried(Boolean.parseBoolean(req.getParameter("isMarried")));
		empOtherinfo.setMotherName(req.getParameter("motherName"));
		empOtherinfo.setNationality(req.getParameter("nationality"));
		empOtherinfo.setPassport(req.getParameter("passport"));
		empOtherinfo.setReligion(req.getParameter("religion"));
		empOtherinfo.setSpouseName(req.getParameter("spouseName"));

		empinf.setEmpOtherinfo(empOtherinfo);

		System.out.println("dd" + empOtherinfo.toString());

		boolean result = dao.createEmployeeInfo(empinf);

		if (result) {
			log.info("registeration successfully done");

			RequestDispatcher dispatcher2 = req.getRequestDispatcher("login.jsp?msg=account created successfully");
			dispatcher2.include(req, resp);
		} else {
			log.info("registeration failed");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp?msg=registration failed");
			dispatcher.forward(req, resp);
		}
	}

}
