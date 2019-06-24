package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class FactRecur {

	public static int factr(int a) {
		if (a == 0) {
			return 1;
		}
		return a * factr(a - 1);
	}

	public static void main(String[] args) {

		int res = factr(5);

		log.info("" + res);
	}
}
