package com.testyantra.abstraction.javaapp.atmservices;

public class SBI implements AtmCard {

	@Override
	public void validate() {
		System.out.println("Validating SBI card");
	}
 
	@Override
	public void getinfo() {
		System.out.println("sending sbi customer info");
	}

}
