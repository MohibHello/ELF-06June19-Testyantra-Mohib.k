package com.testyantra.javaapp.array;

public class ArrayDemo {

	public static void main(String[] args) {

		double[] d = new double[5];
		d[0] = 12.1;
		d[1] = 22.3;
		d[2] = 33.3;
		d[3] = 65.4;
		d[4] = 122.2;

		for (int i = 0; i < d.length; i++) {

			System.out.println(d[i]);
		}
	}
}
