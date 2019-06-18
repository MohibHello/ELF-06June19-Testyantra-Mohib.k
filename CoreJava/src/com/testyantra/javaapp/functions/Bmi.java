package com.testyantra.javaapp.functions;

public class Bmi
{

	public static void main(String[] args) {
		
		double weight=75;
		double height=5.5;
		
		double bmi=(weight/(height * height));
		
		System.out.println("Bmi :- "+bmi);
	}
}
