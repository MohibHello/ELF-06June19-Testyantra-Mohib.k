package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee_educational_info")
@Data
public class EmployeeEducationalInfoBean implements Serializable {

	@EmbeddedId
	EmployeeEducationalInfoPKBean educationalInfoPKBean;

	@Column(name = "degree_Type")
	private String degreeType;
	@Column(name = "branch")
	private String branch;
	@Column(name = "college_Name")
	private String collegeName;
	@Column(name = "university")
	private String university;
	@Column(name = "yop")
	private String yop;
	@Column(name = "percentage")
	private Double percentage;
	@Column(name = "location")
	private String location;
}
