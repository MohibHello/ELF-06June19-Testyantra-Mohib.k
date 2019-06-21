package com.testyantra.javaapp.array;

public class ArrayElesearch {

	private static void check(int[] arr, int toCheckValue) {
		boolean test = false;
		for (int element : arr) {
			if (element == toCheckValue) {
				test = true;
				break;
			}
		}
		System.out.println("Is " + toCheckValue + " present in the array: ");
		if (test == true) {
			System.out.println("element is present");
		} else {
			System.out.println("element is not present");
		}
	}

	public static void main(String[] args) {

		int[] m = { 15, 6, 19, 4, 13, 16 };
		check(m, 6);
	}
}