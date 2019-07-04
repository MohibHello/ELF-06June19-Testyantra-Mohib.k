package com.tyss.hibernateapp.dto;

import lombok.Data;

@Data
public class EmployeeEducationalInfoBean {

	private int id;
	private String educationType;
	private String branch;
	private String collegeName;
	private String university;
	private String yop;
	private double percentage;
	private String location;
}
