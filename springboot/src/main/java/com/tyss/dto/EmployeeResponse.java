package com.tyss.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("employee-response")
public class EmployeeResponse {
	@JsonProperty("statusCode")
	private int statusCode;
	
	private String message;
	
	private String description;
	
	private List<EmployeeInfoBean> beans;
	
}
