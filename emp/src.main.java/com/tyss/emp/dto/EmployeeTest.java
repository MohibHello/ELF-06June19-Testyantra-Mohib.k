package com.tyss.emp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee_test")
@Data
public class EmployeeTest {

	@Id
	@Column(name = "eid")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
}
