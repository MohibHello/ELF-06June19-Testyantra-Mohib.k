package com.testyantra.assignment.collection;

import lombok.extern.java.Log;

@Log
public class AgeTest {

	public static void main(String[] args) {

		int n = 12;
		if (n >= 18) {
			log.info("valid Age");
		} else {
			throw new AgeInvalidException();
		}
	}
}
