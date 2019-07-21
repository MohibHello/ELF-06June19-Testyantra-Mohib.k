package com.tyss.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOFactory;
import com.tyss.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/empo")
public class EmployeeInfoController {

	@GetMapping("/getForm")
	public String getForm() {
		return "login";
	}// End of getForm()

	@PostMapping("/formSubmit")
	public String login(EmployeeInfoBean bean, ModelMap modelMap) {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean2 = dao.getEmployeeInfo(bean.getId());

		if (bean2.getPassword().equals(bean.getPassword()) && bean2.getId() == bean.getId()) {
			modelMap.addAttribute("infobean", bean2);
			return "loginmvc";
		} else {
			return "login";
		}
	}// End of submitForm2()

}
