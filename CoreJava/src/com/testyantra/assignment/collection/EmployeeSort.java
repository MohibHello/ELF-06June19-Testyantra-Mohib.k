package com.testyantra.assignment.collection;

import java.util.Scanner;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmployeeSort {

	static Employee emp;

	public static void main(String[] args) {

		EmployeeById id = new EmployeeById();
		EmployeeByName name = new EmployeeByName();
		EmployeeBySalary sal = new EmployeeBySalary();
		log.info("select Option to sort the Objects");
		log.info("1.SortByID 2.SortByName 3.SortBySalary");
		Scanner sc = new Scanner(System.in);
		int res = sc.nextInt();
		sc.close();
		switch (res) {
		case 1:
			emp = id;
			break;
		case 2:
			emp = name;
			break;
		case 3:
			emp = sal;
			break;
		default:
			log.warning("invalid option");
			break;
		}

		Employee e1 = new Employee();
		e1.id = 3;
		e1.age = 19;
		e1.designation = "junior engineer";
		e1.name = "zyn";
		e1.salary = 15000.9;

		Employee e2 = new Employee();
		e2.id = 1;
		e2.age = 22;
		e2.designation = "senior engineer";
		e2.name = "anil";
		e2.salary = 25000.9;

		Employee e3 = new Employee();
		e3.id = 2;
		e3.age = 23;
		e3.designation = "civil engineer";
		e3.name = "madan";
		e3.salary = 45000.9;

		Employee e4 = new Employee();
		e4.id = 4;
		e4.age = 45;
		e4.designation = "robotic engineer";
		e4.name = "james";
		e4.salary = 85000.9;

		TreeSet<Employee> tr = new TreeSet<>(emp);
		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);

		for (Employee emp : tr) {
			log.info("content" + emp);
		}
	}
}
