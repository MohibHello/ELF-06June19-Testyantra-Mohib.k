package com.testyantra.assignment.genericnumbers;

public class OddNumbersDivisibleBy7 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
	}
}
