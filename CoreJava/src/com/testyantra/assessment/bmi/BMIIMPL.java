package com.testyantra.java.assessment.bmi;

import lombok.extern.java.Log;

@Log
public class BMIIMPL {

	public static void main(String[] args) {

		BMI b = (i, j) -> i / (j * j);

		double val = b.bmiCalculator(500, 4.6);

		if (val > 30.0) {
			log.info("over weight");
		} else if (val > 23.5) {
			log.info("normal Weight");
		} else if (val > 16) {
			log.info("obsese");
		} else {
			log.info("underweight");
		}
	}
}
