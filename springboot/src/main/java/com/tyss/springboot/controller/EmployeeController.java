package com.tyss.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.dto.EmployeeAddressInfoBean;
import com.tyss.dto.EmployeeEducationalInfoBean;
import com.tyss.dto.EmployeeExperienceInfoBean;
import com.tyss.dto.EmployeeInfoBean;
import com.tyss.dto.EmployeeResponse;
import com.tyss.springboot.repository.EmployeeRepository;

@EntityScan(basePackages = "com.tyss")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello World!!";
	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmoployee(@RequestBody EmployeeInfoBean infoBean) {
		infoBean.getOtherInfo().setInfoBean(infoBean);
		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : infoBean.getEmployeeEducationalInfoBean()) {
			employeeEducationalInfoBean.getEducationalInfoPKBean().setBean(infoBean);
		}

		for (EmployeeAddressInfoBean employeeAddressInfoBean : infoBean.getAddressInfoBeanList()) {
			employeeAddressInfoBean.getAddressPKBean().setBean(infoBean);
		}

		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : infoBean.getEmployeeExperienceInfoBean()) {
			employeeExperienceInfoBean.getEmployeeExperienceInfoPKBean().setBean(infoBean);
		}

		EmployeeInfoBean manager = infoBean.getMngId();
		manager = repository.findById(manager.getId()).get();
		infoBean.setMngId(manager);
		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(infoBean.getId())) {
			repository.save(infoBean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee Data added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee id already exists");
		}
		return response;
	}

	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getEmployee(@RequestParam int id) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeInfoBean infoBean = repository.findById(id).get();
		if (infoBean != null) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data found successfully");
			response.setBeans(Arrays.asList(infoBean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data not found");
		}

		return response;

	}

	@DeleteMapping(path = "/deleteEmployee", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse deleteEmployee(@RequestParam int id) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeInfoBean infoBean = repository.findById(id).get();
		if (!repository.existsById(infoBean.getId())) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data deleted successfully");
			repository.delete(infoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data not found");
		}

		return response;

	}

	@PutMapping(path = "/updateEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean infoBean) {
		infoBean.getOtherInfo().setInfoBean(infoBean);
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

		EmployeeInfoBean manager = infoBean.getMngId();
		manager = repository.findById(manager.getId()).get();
		infoBean.setMngId(manager);
		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(infoBean.getId())) {
			repository.save(infoBean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee Data added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee id already exists");
		}
		return response;
	}

}