package com.tyss.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings("serial")
@Embeddable
public class EmployeeAddressPKBean implements Serializable {

	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean bean;

	@Column(name = "ADDRESS_TYPE")
	private String addressType;

	public EmployeeInfoBean getBean() {
		return bean;
	}

	public void setBean(EmployeeInfoBean bean) {
		this.bean = bean;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

}