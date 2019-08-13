package com.tyss.empspringrest.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings("serial")
@Embeddable
public class EmployeeEducationalInfoPKBean implements Serializable {

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean bean;
	@Column(name = "EDUCATION_TYPE")
	private String educationType;

	public EmployeeInfoBean getBean() {
		return bean;
	}

	public void setBean(EmployeeInfoBean bean) {
		this.bean = bean;
	}

	public String getEducationType() {
		return educationType;
	}

	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}

}
