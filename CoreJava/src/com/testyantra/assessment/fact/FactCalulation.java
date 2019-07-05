package com.testyantra.assessment.fact;


import java.util.function.Function;


import lombok.extern.java.Log;

@Log
public class FactCalulation {

	public static void main(String[] args) {
		CalculateFactorial cf = new CalculateFactorial();
		
		
		log.info("Fact Without Lambda  "+cf.calculateFact(5));
		log.info("Fact With Lambda  "+cf.lambdaFact(5));
		
	}

}
