package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "training_info")
public class TrainingInfoBean implements Serializable {

	@Id
	@Column(name = "course_Id")
	private int courseId;
	@Column(name = "courseName")
	private String courseName;
	@Column(name = "duration")
	private String duation;
	@Column(name = "course_Type")
	private String courseType;

//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "training_info", joinColumns = { @JoinColumn(name = "course_id") }, inverseJoinColumns = {
//			@JoinColumn(name = "id") })
//	List<EmployeeInfoBean> infoBean;
}// end of TrainnigInfoBean
