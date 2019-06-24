package com.testyantra.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ArrayElesearch {

	private static void check(int[] arr, int toCheckValue) {
		boolean test = false;
		for (int element : arr) {
			if (element == toCheckValue) {
				test = true;
				break;
			}
		}
		log.info("Is " + toCheckValue + " present in the array: ");
		if (test) {
			log.info("element is present");
		} else {
			log.info("element is not present");
		}
	}

	public static void main(String[] args) {

		int[] m = { 15, 6, 19, 4, 13, 16 };
		check(m, 6);
	}
}