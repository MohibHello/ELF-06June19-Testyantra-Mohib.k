package com.tyss.empspringrest.controllers;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.empspringrest.dao.EmployeeDAO;
import com.tyss.empspringrest.dto.EmployeeAddressInfoBean;
import com.tyss.empspringrest.dto.EmployeeEducationalInfoBean;
import com.tyss.empspringrest.dto.EmployeeExperienceInfoBean;
import com.tyss.empspringrest.dto.EmployeeInfoBean;
import com.tyss.empspringrest.dto.EmployeeOtherInfoBean;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}// End of InitBinder

	@DeleteMapping(path = "/deleteEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@RequestParam("id") int id, HttpServletRequest req) {
		EmployeeResponse response = new EmployeeResponse();

		if (req.getSession(false) != null) {

			if (dao.deleteEmployeeInfoBean(id)) {
				response.setStatusCode(201);
				response.setMessage("sucess");
				response.setDec("Employee data deleted successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage("failure");
				response.setDec("Employee data not deleted");
			}

			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDec("plz login first");
			return response;
		}

	}

	@PostMapping(path = "/createEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean, HttpServletRequest req) {
		EmployeeResponse response = new EmployeeResponse();

		if (req.getSession(false) != null) {

			List<EmployeeEducationalInfoBean> eduBeans = bean.getEmployeeEducationalInfoBean();
			for (EmployeeEducationalInfoBean employeeEducationalInfoBean : eduBeans) {
				employeeEducationalInfoBean.getEducationalInfoPKBean().setBean(bean);
			}

			List<EmployeeAddressInfoBean> addressInfoBeans = bean.getAddressInfoBeanList();
			for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBeans) {
				employeeAddressInfoBean.getAddressPKBean().setBean(bean);
			}

			List<EmployeeExperienceInfoBean> employeeExperienceInfoBeans = bean.getEmployeeExperienceInfoBean();
			for (EmployeeExperienceInfoBean employeeExperienceInfoBean : employeeExperienceInfoBeans) {
				employeeExperienceInfoBean.getEmployeeExperienceInfoPKBean().setBean(bean);
			}

			EmployeeOtherInfoBean employeeOtherInfoBean = bean.getOtherInfo();
			employeeOtherInfoBean.setInfoBean(bean);

			if (dao.createEmployeeInfo(bean)) {

				response.setStatusCode(201);

				response.setMessage("sucess");
				response.setDec("Employee data inserted successfully");
			} else {
				System.out.println("bean " + bean.toString());
				response.setStatusCode(401);
				response.setMessage("failure");
				response.setDec("Employee data not inserted");
			}

			return response;
//		return dao.createEmployeeInfo(bean);
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDec("plz login first");
			return response;
		}

	}

	@PutMapping(path = "/updateEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateEmployee(@RequestBody EmployeeInfoBean bean) {
		return dao.updateEmployeeInfo(bean);
	}

	@GetMapping(path = "/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id, HttpServletRequest req) {

		EmployeeResponse response = new EmployeeResponse();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		if (req.getSession(false) != null) {
			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("success");
				response.setDec("employee data found");
				response.setEmployeeInfoBean(Arrays.asList(bean));
			} else {
				response.setStatusCode(401);
				response.setMessage("failure");
				response.setDec("Employee data not found");
			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDec("plz login first");
			return response;
		}
	}

	@GetMapping(path = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(@RequestParam("id") int id, HttpServletRequest req) {
		EmployeeResponse response = new EmployeeResponse();
		if (req.getSession(false) != null) {
			EmployeeInfoBean bean = dao.getEmployeeInfo(id);
			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("success");
				response.setDec("employee data found");
				response.setEmployeeInfoBean(Arrays.asList(bean));
			} else {
				response.setStatusCode(401);
				response.setMessage("failure");
				response.setDec("Employee data not found");
			}

			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDec("plz login first");
			return response;
		}

	}
}
