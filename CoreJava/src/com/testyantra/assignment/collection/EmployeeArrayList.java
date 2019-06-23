package com.testyantra.assignment.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class EmployeeArrayList {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.age = 19;
		e1.designation = "junior engineer";
		e1.name = "rohit";
		e1.salary = 15000.9;

		Employee e2 = new Employee();
		e2.age = 22;
		e2.designation = "senior engineer";
		e2.name = "Kangana";
		e2.salary = 25000.9;

		Employee e3 = new Employee();
		e3.age = 23;
		e3.designation = "civil engineer";
		e3.name = "madan";
		e3.salary = 45000.9;

		Employee e4 = new Employee();
		e4.age = 45;
		e4.designation = "robotic engineer";
		e4.name = "james";
		e4.salary = 85000.9;

		ArrayList<Employee> al = new ArrayList<>();

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		for (Employee emp : al) {

			log.info("Name :- " + emp.name);
			log.info("Age :- " + emp.age);
			log.info("Designation :- " + emp.designation);
			log.info("Salary :- " + emp.salary);
		}
	}
}
