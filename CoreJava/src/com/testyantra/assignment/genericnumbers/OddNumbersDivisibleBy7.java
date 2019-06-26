package com.testyantra.assignment.genericnumbers;

import lombok.extern.java.Log;

@Log
public class OddNumbersDivisibleBy7 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0 && i % 2 != 0) {
				log.info("" + i);

			}
		}
	}
}
