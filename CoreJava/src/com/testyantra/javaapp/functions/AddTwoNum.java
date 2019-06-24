package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class AddTwoNum {
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		int i = add(2, 7);
		log.info("" + i);
	}

}
