package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class LargestNumber {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 15;

		if (num1 > num2) {
			log.info(num1 + " is greater than " + num2);
		} else {
			log.info(num1 + " is less than " + num2);
		}

	}
}
