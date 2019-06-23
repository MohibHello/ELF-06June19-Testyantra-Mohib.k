package com.testyantra.assignment.collection;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

	String name;
	int id;
	int age;
	String designation;
	double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", designation=" + designation + ", salary="
				+ salary + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return 0;
	}

}
