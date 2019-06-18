package com.testyantra.javaapp.exception;

public class GenericExp {

	public static void main(String[] args) {

		// String s = null;

		int[] ar = new int[3];

		try {
//			System.out.println(10 / 0);
//			System.out.println(s.length());
			System.out.println(ar[7]);
		} catch (ArithmeticException e) {
			System.out.println("Exception Reason :-" + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Exception Reason :-" + e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Reason :-" + e.getMessage());
		}
	}
}
