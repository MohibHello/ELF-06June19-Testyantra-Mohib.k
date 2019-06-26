package com.testyantra.assignment.genericnumbers;

import lombok.extern.java.Log;

@Log
public class EvenNumbersDivisibleBy5 {

	public static void main(String[] args) {

		for (int i = 50; i <= 100; i++) {
			if (i % 5 == 0 && i % 2 == 0) {
				log.info("" + i);
			}
		}
	}
}
