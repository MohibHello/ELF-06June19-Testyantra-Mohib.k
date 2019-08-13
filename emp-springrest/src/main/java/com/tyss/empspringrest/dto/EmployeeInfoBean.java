package com.tyss.empspringrest.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@XmlRootElement(name = "employee-info-bean")
@JsonRootName(value = "employee-info-bean")
@XmlAccessorType(XmlAccessType.FIELD)
@Table(name = "employee_info")
@Entity
public class EmployeeInfoBean implements Serializable {

	// @XmlElement(name = "other-info")
	@JsonProperty(value = "other-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean otherInfo;

	// @XmlElement(name = "address-info")
	@JsonProperty(value = "address-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.bean")
	private List<EmployeeAddressInfoBean> addressInfoBeanList;

	// @XmlElement(name = "education-info")
	@JsonProperty(value = "education-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationalInfoPKBean.bean")
	private List<EmployeeEducationalInfoBean> employeeEducationalInfoBean;

	// @XmlElement(name = "experience-info")
	@JsonProperty(value = "experience-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeExperienceInfoPKBean.bean")
	private List<EmployeeExperienceInfoBean> employeeExperienceInfoBean;

	// @XmlElement(name = "training-info")
	@JsonProperty(value = "training-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "employeeInfoBeans")
	private List<TrainingInfoBean> trainingInfoBean;

	@JsonProperty(value = "training-info")
	@Id
	@Column(name = "ID")
	private Integer id;
	@JsonProperty(value = "name")
	@Column(name = "name")
	private String name;
	@JsonProperty(value = "age")
	@Column(name = "age")
	private Integer age;
	@JsonProperty(value = "gender")
	@Column(name = "gender")
	private String gender;
	@JsonProperty(value = "salary")
	@Column(name = "salary")
	private Double salary;
	@JsonProperty(value = "phone")
	@Column(name = "phone")
	private Integer phone;
	@JsonProperty(value = "joiningDate")
	@Column(name = "joining_date")
	private Date joiningDate;
	@JsonProperty(value = "Account_Number")
	@Column(name = "Account_Number")
	private Integer accountNumber;
	@JsonProperty(value = "Email")
	@Column(name = "Email")
	private String email;
	@JsonProperty(value = "Designation")
	@Column(name = "Designation")
	private String designation;
	@JsonProperty(value = "DOB")
	@Column(name = "DOB")
	private Date dob;
	@JsonProperty(value = "password")
	@Column(name = "password")
	private String password;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MNGR_ID", referencedColumnName = "id")
	private EmployeeInfoBean mngId;

	public EmployeeOtherInfoBean getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(EmployeeOtherInfoBean otherInfo) {
		this.otherInfo = otherInfo;
	}

	public List<EmployeeAddressInfoBean> getAddressInfoBeanList() {
		return addressInfoBeanList;
	}

	public void setAddressInfoBeanList(List<EmployeeAddressInfoBean> addressInfoBeanList) {
		this.addressInfoBeanList = addressInfoBeanList;
	}

	public List<EmployeeEducationalInfoBean> getEmployeeEducationalInfoBean() {
		return employeeEducationalInfoBean;
	}

	public void setEmployeeEducationalInfoBean(List<EmployeeEducationalInfoBean> employeeEducationalInfoBean) {
		this.employeeEducationalInfoBean = employeeEducationalInfoBean;
	}

	public List<EmployeeExperienceInfoBean> getEmployeeExperienceInfoBean() {
		return employeeExperienceInfoBean;
	}

	public void setEmployeeExperienceInfoBean(List<EmployeeExperienceInfoBean> employeeExperienceInfoBean) {
		this.employeeExperienceInfoBean = employeeExperienceInfoBean;
	}

	public List<TrainingInfoBean> getTrainingInfoBean() {
		return trainingInfoBean;
	}

	public void setTrainingInfoBean(List<TrainingInfoBean> trainingInfoBean) {
		this.trainingInfoBean = trainingInfoBean;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}

	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}

	public EmployeeInfoBean getMngId() {
		return mngId;
	}

	public void setMngId(EmployeeInfoBean mngId) {
		this.mngId = mngId;
	}

}
