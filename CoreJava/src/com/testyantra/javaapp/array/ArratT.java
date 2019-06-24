package com.testyantra.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ArratT {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			log.info("" + arr[i]);

		}
		log.info("");
		for (int i = arr.length - 1; i >= 0; i--) {
			log.info("" + arr[i]);
		}
	}
}
