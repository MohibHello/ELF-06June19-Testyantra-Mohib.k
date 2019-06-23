package com.testyantra.assignment.genericnumbers;

public class NumberFromFiftyToSixty {
	static void printNos(int n) {
		if (n <= 60) {
			System.out.println(n);
			printNos(n + 1);

		}
	}

	public static void main(String[] args) {
		printNos(50);
	}
}
