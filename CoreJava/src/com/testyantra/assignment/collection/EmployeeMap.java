package com.testyantra.assignment.collection;

public class EmployeeMap {

	String name;
	int id;
	String designation;
	double salary;

	public EmployeeMap(String name, int id, String designation, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "EmployeeMap [name=" + name + ", id=" + id + ", designation=" + designation + ", salary=" + salary + "]";
	}

}
