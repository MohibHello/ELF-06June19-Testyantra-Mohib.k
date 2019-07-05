package com.testyantra.assessment.fact;


import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class CalculateFactorial {
	
	private int i;
	private int fact=1;
	
	//Constructor
	public CalculateFactorial() {
		
	}
	
	public int calculateFact(int val) {
		for(int i=1;i<=val;i++) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	public int lambdaFact(int x) {
		
		Function<Integer,Integer> f = (n) -> {
            for (int i = 1; i <= n; i++)
            fact = i * fact;
            return fact;
        };
		
		return fact;
	}
}
