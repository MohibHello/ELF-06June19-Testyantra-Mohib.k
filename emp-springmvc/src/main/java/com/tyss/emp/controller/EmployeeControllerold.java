package com.tyss.emp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@Controller
//@RequestMapping("/employee")
public class EmployeeControllerold {

	// length typing for get method
	@RequestMapping(path = "/getMessage", method = RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView modelAndView = new ModelAndView();
		// modelAndView.setViewName("../WEB-INF/views/messagePage.jsp");
		modelAndView.setViewName("messagePage");
		return modelAndView;
	}

	// mapping for get method
	@GetMapping("/seeMessage")
	public ModelAndView seeMessage(ModelAndView modelAndView) {
		modelAndView = new ModelAndView();
		// modelAndView.setViewName("../WEB-INF/views/messagePage.jsp");
		modelAndView.setViewName("messagePage");
		return modelAndView;
	}
}
