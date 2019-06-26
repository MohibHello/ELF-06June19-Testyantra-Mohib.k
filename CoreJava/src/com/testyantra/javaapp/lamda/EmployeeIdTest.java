package com.testyantra.javaapp.lamda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmployeeIdTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "hello", 2000.0);
		Employee e2 = new Employee(3, "loly", 5000.0);
		Employee e3 = new Employee(5, "orio", 4000.0);
		Employee e4 = new Employee(2, "rohit", 7000.0);
		Employee e5 = new Employee(4, "mohib", 76000.0);

		EmployeeByIdLamda id = new EmployeeByIdLamda();

		Comparator<Employee> c = (a, b) -> {
			if (a.id < b.id) {
				return -1;
			} else if (a.id > b.id) {
				return 1;
			} else {
				return 0;
			}

		};
		Comparator<Employee> c1 = (a, b) -> a.name.compareTo(b.name);

		TreeSet<Employee> tr = new TreeSet<Employee>(c1);
		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);
		tr.add(e5);

		for (Employee emp : tr) {
			log.info("" + emp);
		}

	}
}
