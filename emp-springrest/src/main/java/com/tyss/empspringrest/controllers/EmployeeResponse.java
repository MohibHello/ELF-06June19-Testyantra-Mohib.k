package com.tyss.empspringrest.controllers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.tyss.empspringrest.dto.EmployeeInfoBean;

@JsonRootName("employee-response")
public class EmployeeResponse {

	@JsonProperty("status-code")
	private int statusCode;

	private String message;
	private String dec;

	private List<EmployeeInfoBean> EmployeeInfoBean;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDec() {
		return dec;
	}

	public void setDec(String dec) {
		this.dec = dec;
	}

	public List<EmployeeInfoBean> getEmployeeInfoBean() {
		return EmployeeInfoBean;
	}

	public void setEmployeeInfoBean(List<EmployeeInfoBean> employeeInfoBean) {
		EmployeeInfoBean = employeeInfoBean;
	}

}
