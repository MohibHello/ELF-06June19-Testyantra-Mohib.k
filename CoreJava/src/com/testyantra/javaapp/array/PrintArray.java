package com.testyantra.javaapp.array;

public class PrintArray {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 4, 3, 2, 6 };
		String[] b = { "a", "b", "c", "d" };
		double[] c = { 1.4, 3.6, 2.3, 5.2, 5.6, 7.7 };
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		for (String string : b) {
			System.out.println(string);

		}
		System.out.println("@@@@@@@@@@@@@@@@");
		for (double d : c) {
			System.out.println(d);
		}
	}
}
