package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class Bmi {

	public static void main(String[] args) {

		double weight = 75;
		double height = 5.5;

		double bmi = (weight / (height * height));

		log.info("Bmi :- " + bmi);
	}
}
