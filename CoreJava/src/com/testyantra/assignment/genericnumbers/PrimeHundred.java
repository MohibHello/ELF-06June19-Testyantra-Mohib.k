package com.testyantra.assignment.genericnumbers;

import lombok.extern.java.Log;

@Log
public class PrimeHundred {

	public static void main(String[] args) {

		int n = 100;
		for (int i = 1; i <= n; i++) {
			prime(i);
		}

	}

	public static void prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			log.info("" + n);
		}

	}
}
