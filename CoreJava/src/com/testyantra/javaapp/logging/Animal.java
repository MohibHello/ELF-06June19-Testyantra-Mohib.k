package com.testyantra.javaapp.logging;

public class Animal {

	void sound() {
		System.out.println("some sound");
	}

	double div(int a, int b) {
		double res = 0;
		try {
			res = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return res;
	}
}
