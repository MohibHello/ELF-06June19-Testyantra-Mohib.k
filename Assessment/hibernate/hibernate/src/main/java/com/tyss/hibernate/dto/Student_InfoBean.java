package com.tyss.hibernate.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Student_Info")
@Data
public class Student_InfoBean {

	@Id
	@Column(name = "rollNum")
	private int rollNum;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "mobileNo")
	private long mobileNo;
	@Column(name = "emailId")
	private String emailId;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Student_OtherInfoBean otherInfoBean;
}
