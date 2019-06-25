package com.testyantra.javaapp.doublecolon;

public class MyStudent {

	public static int sum(int a, int b) {
		return a + b;

	}

	public double avg(int a, int b, int c) {
		return ((a + b + c) / 3.0);
	}

	public int fact(int a) {
		int m = 1;
		for (int i = 1; i <= a; i++) {

			m = m * i;
		}
		return m;
	}
}
