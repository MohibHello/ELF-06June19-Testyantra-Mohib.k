package com.tyss.designpattern.builder;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public final class EmployeeData {
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joiningDate;
	private long accountNumber;
	private String email;
	private String designation;
	private Date dob;
	private int departmentId;
	private int managerId;

}// End of Class
