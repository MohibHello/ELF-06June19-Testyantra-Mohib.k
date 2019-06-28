package com.testyantra.java.assessment;

public class SIPercentageFactorial {

	public double simpleInterest(int p, int t, int r) {

		return (p * t * r) / 100;
	}

	public double percentageOfThreeSubject(int mark1, int mark2, int mark3, int total) {

		return ((mark1 + mark2 + mark3) * 100) / total;
	}

	public int factorial(int num) {

		int m = 1;
		for (int i = 1; i <= num; i++) {
			m = m * i;
		}
		return m;
	}
}
