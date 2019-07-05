package com.testyantra.assessment.sibylamda;
import lombok.extern.java.Log;
@Log
public class CalculateSimpleInterestByLambda {

	public static void main(String[] args) {
		int principle = 9000;
		double rate = 7.5;
		int year = 2;
		SimpleInterestCalculation s = (p, r, y) -> (p * r * y) / 100;
		double res = s.calculateSI(principle, rate, year);
		log.info("Simple Interest is " + res);
	}

}
