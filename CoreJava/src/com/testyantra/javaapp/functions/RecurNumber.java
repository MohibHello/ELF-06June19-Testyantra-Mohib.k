package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class RecurNumber {
	public static void main(String[] args) {

		int a = recu(5);
		log.info("" + a);
	}

	public static int recu(int a) {
		if (a == 0) {
			return ++a;
		}
		return a * recu(a - 1);
	}
}
