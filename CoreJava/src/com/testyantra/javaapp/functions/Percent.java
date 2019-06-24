package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class Percent {
	public static void main(String[] args) {

		double res = per(300, 600);
		log.info("" + res);
	}

	public static double per(double a, double b) {
		return ((a / b) * 100);
	}
}
