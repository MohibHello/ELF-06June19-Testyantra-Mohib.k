package com.testyantra.javaapp.array;

import lombok.extern.java.Log;

@Log
public class CopyArray {
	public static void main(String[] args) {

		int[] ar = { 9, 6, 2, 4, -1 };
		int[] b = new int[ar.length];

		for (int i = 0; i < ar.length; i++) {

			b[i] = ar[i];
		}
		for (int i = 0; i < b.length; i++) {
			log.info("" + b[i]);
		}
	}
}
