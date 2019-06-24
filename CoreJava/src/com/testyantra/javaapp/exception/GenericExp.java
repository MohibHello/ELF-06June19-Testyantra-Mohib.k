package com.testyantra.javaapp.exception;

import lombok.extern.java.Log;

@Log
public class GenericExp {

	public static void main(String[] args) {

		int[] ar = new int[3];

		try {
			log.info("" + ar[7]);
		} catch (ArithmeticException e) {
			log.info("AE Reason :-" + e.getMessage());
		} catch (NullPointerException e) {
			log.info("Exception Reason :-" + e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			log.info("AIO Reason :-" + e.getMessage());
		}
	}
}
