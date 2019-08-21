package com.tyss.lms.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("lms-response")
public class Response {

		private int statusCode;
		
		private String message;
		
		private String description;
		
		private List<Object> beans;
		
	}
