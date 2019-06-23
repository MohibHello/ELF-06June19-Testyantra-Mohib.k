package com.testyantra.assignment.collection;

import lombok.extern.java.Log;

@Log
public class AgeInvalidException extends RuntimeException {

	public AgeInvalidException() {
		log.info("AgeInvalidException");
	}

	@Override
	public String getMessage() {
		return "Age Is Below 18";
	}
}
