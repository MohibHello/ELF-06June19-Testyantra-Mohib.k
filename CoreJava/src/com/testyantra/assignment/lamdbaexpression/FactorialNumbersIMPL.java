package com.testyantra.assignment.lamdbaexpression;

import lombok.extern.java.Log;

@Log
public class FactorialNumbersIMPL {

	public static void main(String[] args) {

		FactorialNumbers f = a -> {
			int m = 1;
			for (int i = 1; i <= a; i++) {

				m = m * i;

			}
			return m;
		};
		int res = f.fact(5);
		log.info("Result :- " + res);
	}
}
