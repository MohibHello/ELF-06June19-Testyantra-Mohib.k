package com.testyantra.assignment.collection;

import java.util.Comparator;

public class EmployeeById extends Employee implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		Integer id = o1.id;
		Integer id2 = o2.id;

		return id.compareTo(id2);

	}

}
