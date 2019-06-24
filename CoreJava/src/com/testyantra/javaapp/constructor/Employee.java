package com.testyantra.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Employee {

	String name;
	int id;
	double salary;

	public Employee(String name, int id, double salary) {

		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	void display() {
		log.info("Name := " + name);
		log.info("ID := " + id);
		log.info("Salary := " + salary);
	}

	public static void main(String[] args) {

		Employee e = new Employee("Jagdesh", 505, 15000.0);
		e.display();
	}

}
