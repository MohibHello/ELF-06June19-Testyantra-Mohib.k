package com.tyss.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOFactory;
import com.tyss.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/emp")
public class EmployeeInfoController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}// End of initBinder()

	@GetMapping("/getForm")
	public String getForm() {
		return "login";
	}// End of getForm()

	@PostMapping("/validate")
	public String login(EmployeeInfoBean bean, ModelMap modelMap) {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean2 = dao.getEmployeeInfo(bean.getId());

		if (bean2.getPassword().equals(bean.getPassword()) && bean2.getId() == bean.getId()) {
			modelMap.addAttribute("bean", bean2);
			return "loginmvc";
		} else {
			String msg = "Invalid password or User";
			modelMap.addAttribute("msg", msg);
			return "login";
		}
	}// End of submitForm2()

	@GetMapping("/create")
	public String getSubmitForm() {
		return "createemp";
	}

	@PostMapping("/insdata")
	public String create(EmployeeInfoBean bean, ModelMap map) {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		map.addAttribute("bean1", bean);
		boolean bean1 = dao.createEmployeeInfo(bean);

		if (bean1) {
			String msg = "account created login";
			map.addAttribute("msg", msg);
			return "login";
		} else {
			String msg = "reg fail try again";
			map.addAttribute("msg", msg);
			return "createemp";
		}
	}
}
