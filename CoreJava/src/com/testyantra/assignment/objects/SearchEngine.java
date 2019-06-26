package com.testyantra.assignment.objects;

import lombok.extern.java.Log;

@Log
public class SearchEngine {

	void search(EmployeeTwo e) {
		if (e instanceof Id) {
			log.info("search by ID");
		} else if (e instanceof Name) {
			log.info("search by Name");
		}
	}
}
