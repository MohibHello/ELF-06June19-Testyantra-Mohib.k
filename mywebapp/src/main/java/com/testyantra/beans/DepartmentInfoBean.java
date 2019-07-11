package com.testyantra.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "department_info")
@Entity
@Data
public class DepartmentInfoBean {
	@Id
	@Column(name = "dept_id")
	private int deptNo;
	@Column(name = "department_name")
	private String departmentName;
}
