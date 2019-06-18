package com.testyantra.javaapp.exception;

public class TestCustom {

	public static void main(String[] args) {

		System.out.println("main started");
		StringValidate s = new StringValidate();
		try {
			s.validate("hey");
		} catch (CustomException e) {
			System.out.println(e.getMessage());
			;
		}
		System.out.println("main ended");

	}
}
