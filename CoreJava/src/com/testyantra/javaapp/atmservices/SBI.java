package com.testyantra.abstraction.javaapp.atmservices;
import lombok.extern.java.Log;

@Log
public class SBI implements AtmCard {

	@Override
	public void validate() {
		log.info("Validating SBI card");
	}
 
	@Override
	public void getinfo() {
		log.info("sending sbi customer info");
	}

}
