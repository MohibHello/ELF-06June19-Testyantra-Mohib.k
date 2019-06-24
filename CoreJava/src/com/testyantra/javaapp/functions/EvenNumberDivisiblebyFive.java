package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class EvenNumberDivisiblebyFive {
	public static void main(String[] args) {

		for (int i = 50; i <= 100; i++) {
			if (i % 5 == 0 && i % 2 == 0) {
				log.info("" + i);
			}
		}
	}
}
