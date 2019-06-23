package com.testyantra.assignment.genericnumbers;

public class PrimeHundred {

	public static void main(String[] args) {

		int n = 100;
		for (int i = 1; i <= n; i++) {
			Prime(i);
		}

	}

	public static void Prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(n);
		}

	}
}
