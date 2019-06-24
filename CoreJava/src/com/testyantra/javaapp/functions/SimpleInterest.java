package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class SimpleInterest {

	public static void main(String[] args) {

		int p = 15000;
		int t = 2;
		double r = 14.92;

		double si = (p * t * r) / 100;

		log.info("" + si);
	}
}
