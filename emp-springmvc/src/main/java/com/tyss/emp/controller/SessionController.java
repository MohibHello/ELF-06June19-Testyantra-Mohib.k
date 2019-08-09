package com.tyss.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/session")
public class SessionController {

	@GetMapping("/loginForm")
	public String login() {
		return "login";
	}// End of login()

	@PostMapping("/login")
	public String authenticate(EmployeeInfoBean userBean) {
		if (userBean.getId() == 101) {

		}
		return null;
	}// End of authenticate()

}// End of Controller
