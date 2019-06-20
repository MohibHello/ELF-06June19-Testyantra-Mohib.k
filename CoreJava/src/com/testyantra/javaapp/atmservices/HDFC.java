package com.testyantra.abstraction.javaapp.atmservices;

import java.util.logging.Logger;

public class HDFC implements AtmCard {

	private static final Logger l = Logger.getLogger("atm");

	public void validate() {

		System.out.println("validating HDFC card");
	}

	public void getinfo() {
		System.out.println("sending Required info of HDfc customer");
	}

}
