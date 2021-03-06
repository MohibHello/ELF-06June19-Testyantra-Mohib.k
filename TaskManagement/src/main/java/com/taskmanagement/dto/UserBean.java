package com.taskmanagement.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
@SuppressWarnings(value = { "serial" })
@JsonRootName(value = "User")
@JsonIgnoreProperties(value = {"password"}, allowSetters = true)
public class UserBean implements Serializable {

	@GeneratedValue
	@Id
	@Column(name = "emp_id")
	private Integer empId;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "email", unique = true)
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "designation")
	private String designation;

}
