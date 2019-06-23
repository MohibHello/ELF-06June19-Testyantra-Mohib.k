package com.testyantra.assignment.genericnumbers;

public class IsPrime {

	public static int count = 0;

	public static void main(String[] args) {

		int n = 13;
		boolean res = isPrime(n);
		System.out.println("result :" + res);
	}

	public static boolean isPrime(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}

		return false;
	}

}
