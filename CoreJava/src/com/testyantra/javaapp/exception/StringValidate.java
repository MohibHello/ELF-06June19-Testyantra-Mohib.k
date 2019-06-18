package com.testyantra.javaapp.exception;

public class StringValidate {

	void validate(String name) {
		if (name.length() >= 5) {
			System.out.println("valid String");
		} else {
			throw new CustomException("Invalid String : Should contain more than 5 characters");
		}
	}
}
