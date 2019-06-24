package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class MulTwoNum {
	public static int mul(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		int t = mul(3, 5);

		log.info("result :- " + t);
	}
}
