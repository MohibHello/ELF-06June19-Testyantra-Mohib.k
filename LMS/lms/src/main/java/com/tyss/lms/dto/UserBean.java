package com.tyss.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@SuppressWarnings("serial")
@JsonRootName(value = "user-bean")
@Table(name = "user")
@Entity
@Data
public class UserBean implements Serializable {
	
	
	
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name ="name")
	private String name;
	@Column(name ="password")
	private String password;
	@Column(name = "user_type")
	private String userType;
	@Column(name = "address")
	private String address;
	@Column(name = "phoneNumber")
	private long phoneNumber;
	@Column(name = "email")
	private String email;
	@Column(name = "validty")
	private Date validty;
}
