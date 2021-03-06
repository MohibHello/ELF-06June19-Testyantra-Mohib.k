package com.tyss.hibernatemapping.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "salary")
	private int salary;
	@Column(name = "phone")
	private long phone;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "account_number")
	private long accountNumber;
	@Column(name = "email")
	private String email;
	@Column(name = "designation")
	private String designation;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "dept_id")
	private int departmentId;

	@ManyToOne
	@JoinColumn(name = "mgr_id", referencedColumnName = "id")
	private EmployeeInfoBean managerId;

}
