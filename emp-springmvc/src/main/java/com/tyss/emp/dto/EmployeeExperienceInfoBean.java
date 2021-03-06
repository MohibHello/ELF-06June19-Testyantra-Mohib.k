package com.tyss.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "employee_experience_info")
public class EmployeeExperienceInfoBean implements Serializable {

	@EmbeddedId
	private EmployeeExperienceInfoPKBean employeeExperienceInfoPKBean;
	@Column(name = "designation")
	private String designation;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "leaving_date")
	private Date leavingDate;
}
