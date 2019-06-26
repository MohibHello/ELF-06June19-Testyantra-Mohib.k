package com.testyantra.javaapp.collection.set;

import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {

		EmployeeByID eid = new EmployeeByID();
		EmployeeBySalary es = new EmployeeBySalary();
		EmployeeByName en = new EmployeeByName();
		TreeSet<Employee> tr = new TreeSet<Employee>(en);

		Employee e1 = new Employee();
		e1.id = 201;
		e1.name = "abc";
		e1.salary = 45000.9;

		Employee e2 = new Employee();
		e2.id = 203;
		e2.name = "mno";
		e2.salary = 68000.9;

		Employee e3 = new Employee();
		e3.id = 202;
		e3.name = "def";
		e3.salary = 97000.9;

		Employee e4 = new Employee();
		e4.id = 204;
		e4.name = "xyz";
		e4.salary = 54000.9;

		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);

		for (Employee e : tr) {
			System.out.println("Employee ID :" + e.id);
			System.out.println("Name : " + e.name);
			System.out.println("Salary : " + e.salary);
			System.out.println("*********");
		}

	}
}
