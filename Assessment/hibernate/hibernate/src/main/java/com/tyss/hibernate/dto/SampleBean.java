package com.tyss.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "sample")
@Data
public class SampleBean {

		@Id
		@Column(name = "id")
		private int id;
		@Column(name = "firstName")
		private String firstName;
		@Column(name = "lastName")
		private String lastName;
		@Column(name = "city")
		private String city;
		
}
