package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class EvenOdd {
	public static void main(String[] args) {
		int num = 155;

		if (num % 2 == 0) {
			log.info(num + " is Even number");
		} else {
			log.info(num + " is Odd number");
		}

	}
}
