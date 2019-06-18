package com.testyantra.javaapp.javabean;

import java.util.Scanner;

public class TestE {

	public static void main(String[] args) {

		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details");
		String name = sc.nextLine();
		int salary = sc.nextInt();
		char gender = sc.next().charAt(0);

		e.setName(name);
		e.setGender(gender);
		e.setSalary(salary);

		EDB1 e1 = new EDB1();
		e1.receive(e);
		sc.close();
	}
}
