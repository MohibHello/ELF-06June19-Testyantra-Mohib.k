package com.tyss.empspringrest.controllers;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.empspringrest.dao.EmployeeDAO;
import com.tyss.empspringrest.dto.EmployeeInfoBean;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	@Qualifier("hibernate")
	private EmployeeDAO dao;

	@PostMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password, HttpServletRequest req) {

		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		EmployeeResponse response = new EmployeeResponse();

		if (bean.getPassword().equals(password) && bean.getId() == id) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDec("login success");
			response.setEmployeeInfoBean(Arrays.asList(bean));
			req.getSession().setAttribute("bean", bean);
		} else {
			response.setStatusCode(401);
			response.setDec("Failure");
			response.setMessage("Invalid Creditial");

		}
		return response;
	}

	@GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDec("logout success");
		return response;
	}

	@GetMapping(value = "/readcookie", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name = "JSESSIONID") String sessionId) {

		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("cookie reading");
		response.setDec("JSESSIONID -->" + sessionId);
		return response;
	}

}
