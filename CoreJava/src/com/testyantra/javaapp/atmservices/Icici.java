package com.testyantra.abstraction.javaapp.atmservices;

public class Icici implements AtmCard {

	public void validate() {
		System.out.println("validating ICICI card");
	}

	public void getinfo() {
		System.out.println("sending required info");
	}

}
