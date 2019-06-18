package com.testyantra.javaapp.javabean;

public class TestEE {

	public static void main(String[] args) {

		Employee1 e1 = new Employee1(true, "mahesh", 2303);

		System.out.println("Employee Name :- " + e1.getName());
		System.out.println("employee Id :-" + e1.getId());
		System.out.println("employee Status (true=working/false=not working) :- " + e1.isStatus());
	}
}
