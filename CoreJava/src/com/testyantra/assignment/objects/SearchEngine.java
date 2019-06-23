package com.testyantra.assignment.objects;

public class SearchEngine {

	void search(EmployeeTwo e) {
		if (e instanceof Id) {
			System.out.println("search by ID");
		} else if (e instanceof Name) {
			System.out.println("search by Name");
		}
	}
}
