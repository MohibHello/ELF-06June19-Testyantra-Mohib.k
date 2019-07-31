package com.tyss.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class CustomerBean implements Serializable {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "contactNumber")
	private long contactNumber;
	@Column(name = "address")
	private String address;
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;

}
