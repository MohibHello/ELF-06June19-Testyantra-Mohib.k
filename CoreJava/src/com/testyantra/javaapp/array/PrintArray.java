package com.testyantra.javaapp.array;

import lombok.extern.java.Log;

@Log
public class PrintArray {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 4, 3, 2, 6 };
		String[] b = { "a", "b", "c", "d" };
		double[] c = { 1.4, 3.6, 2.3, 5.2, 5.6, 7.7 };
		for (int i : a) {
			log.info("" + i);
		}
		log.info("@@@@@@@@@@@@@@@@@@@@");
		for (String string : b) {
			log.info("" + string);

		}
		log.info("@@@@@@@@@@@@@@@@");
		for (double d : c) {
			log.info("" + d);
		}
	}
}
