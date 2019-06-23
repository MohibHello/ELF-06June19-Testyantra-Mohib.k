package com.testyantra.assignment.genericnumbers;

public class EvenNumbersDivisibleBy5 {

	public static void main(String[] args) {

		for (int i = 50; i <= 100; i++) {
			if (i % 5 == 0) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
	}
}
