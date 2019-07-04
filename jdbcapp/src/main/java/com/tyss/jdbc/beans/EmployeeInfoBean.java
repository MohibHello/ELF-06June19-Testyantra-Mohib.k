package com.tyss.jdbc.beans;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeInfoBean {

	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	private long phone;
	private Date joiningDate;
	private long accountNumber;
	private String email;
	private String designation;
	private Date dob;
	private int deptNo;
	private int mgrId;
}
