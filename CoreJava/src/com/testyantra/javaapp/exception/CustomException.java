package com.testyantra.javaapp.exception;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String name;

	public CustomException(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getMessage() {

		return "invalid String";

	}

}
