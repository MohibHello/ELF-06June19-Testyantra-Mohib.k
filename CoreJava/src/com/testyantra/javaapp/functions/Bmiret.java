package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class Bmiret {
	public static double bmi(double w, double h) {

		double bmi = (w / (h * h));
		log.info("" + bmi);
		return bmi;

	}

	public static void bmiResult(double res) {
		if (res >= 30.0) {
			log.info(" Obese");
		} else if (res >= 25) {
			log.info("overweight");
		} else if (res >= 18.5) {
			log.info("normal");
		} else if (res >= 16.5) {
			log.info("underweight");
		} else {
			log.info("severe underweight");
		}

	}

	public static void main(String[] args) {
		double bimres = bmi(1.95, 6.5);
		bmiResult(bimres);
	}
}
