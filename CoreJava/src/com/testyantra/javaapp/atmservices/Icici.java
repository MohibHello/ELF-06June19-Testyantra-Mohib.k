package com.testyantra.abstraction.javaapp.atmservices;
import lombok.extern.java.Log;

@Log
public class Icici implements AtmCard {

	public void validate() {
		log.info("validating ICICI card");
	}

	public void getinfo() {
		log.info("sending required info");
	}

}
