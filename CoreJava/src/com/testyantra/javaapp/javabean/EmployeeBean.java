package com.testyantra.javaapp.javabean;

public class EmployeeBean {

	private int id;
	private String name;
	private String deptartment;
	private double salary;
	private int age;
	private java.util.Date joining_date;
	private String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptartment() {
		return deptartment;
	}

	public void setDeptartment(String deptartment) {
		this.deptartment = deptartment;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public java.util.Date getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(java.util.Date joining_date) {
		this.joining_date = joining_date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", deptartment=" + deptartment + ", salary=" + salary
				+ ", age=" + age + ", joining_date=" + joining_date + ", gender=" + gender + "]";
	}

}
