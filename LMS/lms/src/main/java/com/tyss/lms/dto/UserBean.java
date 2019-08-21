package com.tyss.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@SuppressWarnings("serial")
@JsonRootName(value = "user-bean")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
@Table(name = "user")
@Entity
@Data
public class UserBean implements Serializable {
	

	@Id
	@GeneratedValue
	@JsonProperty(value ="userId")
	@Column(name = "user_id")
	private Integer userId;
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
