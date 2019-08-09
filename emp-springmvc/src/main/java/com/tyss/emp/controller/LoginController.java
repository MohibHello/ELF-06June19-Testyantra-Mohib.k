package com.tyss.emp.controller;

import static com.tyss.emp.common.EMPCommons.PROP_PATH;
import static com.tyss.emp.common.EMPCommons.VIEW_HOMEPAGE;
import static com.tyss.emp.common.EMPCommons.VIEW_LOGINPAGE;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dto.EmployeeAddressInfoBean;
import com.tyss.emp.dto.EmployeeEducationalInfoBean;
import com.tyss.emp.dto.EmployeeExperienceInfoBean;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;

@Controller
@PropertySource(PROP_PATH)
@RequestMapping("/login")
public class LoginController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}// End of initBinder()

	@GetMapping("/loginPage")
	public String loginPage() {
		return VIEW_LOGINPAGE;
	}// End of loginPage()

	@PostMapping("/authenticate")
	public String authenticate(int id, String password, HttpServletRequest req, @Value("${invalidlogin}") String msg) {

		// EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInstancetype);
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		if (bean.getPassword().equals(password) && bean.getId() == id) {
			HttpSession session = req.getSession(true);
			session.setAttribute("bean", bean);
			return VIEW_HOMEPAGE;
		} else {
			req.setAttribute("msg", msg);
			return VIEW_LOGINPAGE;
		}
	}// End of authenticate()

	@GetMapping("/create")
	public String getSubmitForm() {
		return "createemp";
	}// end of getSubmitForm()

	@PostMapping("/indata")
	public String create(EmployeeInfoBean infoBean, ModelMap map) {

		List<EmployeeEducationalInfoBean> eduBeans = infoBean.getEmployeeEducationalInfoBean();
		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : eduBeans) {
			employeeEducationalInfoBean.getEducationalInfoPKBean().setBean(infoBean);
		}

		List<EmployeeAddressInfoBean> addressInfoBeans = infoBean.getAddressInfoBeanList();
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBeans) {
			employeeAddressInfoBean.getAddressPKBean().setBean(infoBean);
		}

		List<EmployeeExperienceInfoBean> employeeExperienceInfoBeans = infoBean.getEmployeeExperienceInfoBean();
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : employeeExperienceInfoBeans) {
			employeeExperienceInfoBean.getEmployeeExperienceInfoPKBean().setBean(infoBean);
		}

		EmployeeOtherInfoBean employeeOtherInfoBean = infoBean.getEmployeeOtherInfoBean();
		employeeOtherInfoBean.setInfoBean(infoBean);
		boolean result = dao.createEmployeeInfo(infoBean);

		if (result) {
			String msg = "account created login";
			map.addAttribute("msg", msg);
			return "loginPage";
		} else {
			String msg = "reg fail try again";
			map.addAttribute("msg", msg);
			return "createemp";
		}
	}// End of create()

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap, @Value("${logoutmsg}") String logoutmsg) {
		session.invalidate();
		modelMap.addAttribute("msg", logoutmsg);
		return VIEW_LOGINPAGE;
	}// end of logout()

	@GetMapping("/updateemployee")
	public String getupdateEmployee() {
		return "updateemployee";
	}

	@PostMapping("/updateemployee")
	public String updateEmployee(EmployeeInfoBean infoBean, int mgrId) {
		EmployeeInfoBean mgrBean = dao.getEmployeeInfo(mgrId);
		infoBean.setManagerId(mgrId);
		dao.updateEmployeeInfo(infoBean);
		return VIEW_HOMEPAGE;
	}

}
