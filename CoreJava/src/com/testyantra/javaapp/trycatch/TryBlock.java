package com.testyantra.javaapp.trycatch;

import lombok.extern.java.Log;

@Log
public class TryBlock {

	public static void main(String[] args) {

		try {
			int[] ar = new int[2];
			log.info("E" + (10 / 0));
			log.info("" + ar[9]);
		} catch (ArithmeticException | NullPointerException e) {
			log.warning("Exception :- " + e.getMessage());
		} catch (Exception e) {
			log.warning(" exception" + e);
		}
	}
}
