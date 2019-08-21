package com.tyss.lms.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.Response;
import com.tyss.lms.dto.UserBean;

@RestController
@EntityScan(basePackages = "com.tyss")
//@CrossOrigin(origins="http://localhost:3000")
public class LoginController {
	@Autowired
	UserRepository repository;

	@PostMapping(value = "/loginPage", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response submitForm(int id, String password, HttpServletRequest request) {
		
		UserBean bean = repository.findById(id).get();
		Response response = new Response();
		if (bean != null && bean.getPassword().equals(password)) {

			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Login successfully");
			response.setBeans(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);

		} else {
			response.setStatusCode(200);
			response.setMessage("Failed");
			response.setDescription("Login Failed");
		}
		return response;
	}

	@GetMapping("/logoutsubmit")
	public Response logout(HttpSession session) {
		Response response = new Response();
		session.invalidate();
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Logout successfully");
		return response;
	}

	@GetMapping("/readCookie")
	public Response readCookie(@CookieValue(name = "JSESSIONID") String sessionId) {
		Response response = new Response();
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("JSESSIONID:" + sessionId);
		return response;
	}
}
