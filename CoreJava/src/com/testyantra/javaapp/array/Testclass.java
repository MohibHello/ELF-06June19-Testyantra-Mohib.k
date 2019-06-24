package com.testyantra.javaapp.array;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class Testclass {

	public static void main(String[] args) {

		Employee[] emp = new Employee[4];

		Employee e = new Employee();
		e.setId(101);
		e.setName("mahesh");
		e.setSalary(5000.9);
		e.setAge(16);

		emp[0] = e;

		Employee e1 = new Employee();
		e1.setId(121);
		e1.setName("mohan");
		e1.setSalary(7000.9);
		e1.setAge(18);

		emp[1] = e1;

		Employee e2 = new Employee();
		e2.setId(103);
		e2.setName("manoj");
		e2.setSalary(12000.9);
		e2.setAge(19);

		emp[2] = e2;

		Employee e3 = new Employee();
		e3.setId(105);
		e3.setName("mahi");
		e3.setSalary(45000.9);
		e3.setAge(26);

		emp[3] = e3;

		Arrays.sort(emp);

		for (Employee employee : emp) {
			log.info(employee.toString());
		}
	}
}
