package com.testyantra.assignment.streamandproperties;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class EmpWithMinSalary {

	public static void main(String[] args) {

		Employee e1 = new Employee("mohib", 11, 22, "software intern", 2000);
		Employee e2 = new Employee("ramesh", 12, 56, "software developer", 5000);
		Employee e3 = new Employee("prajwal", 16, 34, "software engineer", 7000);
		Employee e4 = new Employee("rakesh", 13, 25, "software tester", 3000);
		Employee e5 = new Employee("anitha", 19, 21, "software intern", 12000);

		Comparator<Employee> c = (a, b) -> {
			if (a.getSalary() > b.getSalary()) {
				return 1;
			} else if (a.getSalary() < b.getSalary()) {
				return -1;
			} else {
				return 0;
			}
		};

		ArrayList<Employee> al = new ArrayList<>();

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e4);
		al.add(e5);

		Employee es = al.stream().min(c).get();

		log.info("Employee With Max Salary" + es);

	}
}
