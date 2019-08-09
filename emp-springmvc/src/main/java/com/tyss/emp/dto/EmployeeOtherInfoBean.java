package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "employee_other_info")
public class EmployeeOtherInfoBean implements Serializable {
	@JoinColumn(name = "id")
	@Id
	@OneToOne
	EmployeeInfoBean infoBean;

	@Column(name = "ismarried")
	private boolean isMarried;

	@Column(name = "blood_group")
	private String bloodGroup;

	@Column(name = "ischallenged")
	private boolean ischallenged;

	@Column(name = "emergency_contact_number")
	private Long emergencyContactNumber;

	@Column(name = "emergency_contact_person")
	private String emergencyContactPerson;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "religion")
	private String religion;

	@Column(name = "father_name")
	private String fatherName;

	@Column(name = "mother_name")
	private String motherName;

	@Column(name = "spouse_name")
	private String spouseName;

	@Column(name = "passport")
	private String passport;

	@Column(name = "adhar")
	private Long adhar;

	@Column(name = "pan")
	private String pan;

}
