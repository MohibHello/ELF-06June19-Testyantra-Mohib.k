package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class OddNumberDivisibleBySeven {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0 && i % 2 != 0) {
				log.info("" + i);
			}
		}
	}
}
