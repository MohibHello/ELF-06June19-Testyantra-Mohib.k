package com.tyss.emp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "employee_info")
@Entity
@Data
public class EmployeeInfoBean implements Serializable {

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.bean")
	private List<EmployeeAddressInfoBean> addressInfoBeanList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationalInfoPKBean.bean")
	private List<EmployeeEducationalInfoBean> employeeEducationalInfoBean;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeExperienceInfoPKBean.bean")
	private List<EmployeeExperienceInfoBean> employeeExperienceInfoBean;

	/*
	 * @ManyToMany(cascade = CascadeType.ALL, mappedBy = "employeeInfoBeans")
	 * private List<TrainingInfoBean> trainingInfoBean;
	 */

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "salary")
	private Double salary;
	@Column(name = "phone")
	private int phone;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "Account_Number")
	private int accountNumber;
	@Column(name = "Email")
	private String email;
	@Column(name = "Designation")
	private String designation;
	@Column(name = "DOB")
	private Date dob;

	@Column(name = "dept_id")
	private int departmentId;

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID")
//	private DepartmentInfoBean departmentInfoBean;

	@Column(name = "password")
	private String password;

	@Column(name = "mgr_id")
	private int managerId;

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MNGR_ID", referencedColumnName = "id")
//	private EmployeeInfoBean mngId;

}
