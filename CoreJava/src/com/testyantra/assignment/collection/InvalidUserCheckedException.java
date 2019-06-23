package com.testyantra.assignment.collection;

import lombok.extern.java.Log;

@Log
public class InvalidUserCheckedException extends Exception {

	public InvalidUserCheckedException() {
		log.info("Invalid User checked exception");
	}

	@Override
	public String getMessage() {
		return "Invalid User exception";
	}
}
