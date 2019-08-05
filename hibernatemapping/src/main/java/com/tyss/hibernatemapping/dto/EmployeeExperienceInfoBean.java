package com.tyss.hibernatemapping.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_experience_info")
public class EmployeeExperienceInfoBean implements Serializable {

	@EmbeddedId
	EmployeeExpPKBean empExpBean;

	@Column(name = "designation")
	private String designation;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "leaving_date")
	private Date leavingDate;
}
