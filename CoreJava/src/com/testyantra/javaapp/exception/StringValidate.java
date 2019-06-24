package com.testyantra.javaapp.exception;

import lombok.extern.java.Log;

@Log
public class StringValidate {

	void validate(String name) {
		if (name.length() >= 5) {
			log.info("valid String");
		} else {
			throw new CustomException("Invalid String : Should contain more than 5 characters");
		}
	}
}
