package com.testyantra.abstraction.javaapp.atmservices;

import java.util.logging.Logger;

public class HDFC implements AtmCard {

	private static final Logger log = Logger.getLogger("atm");

	public void validate() {

		log.info("validating HDFC card");
	}

	public void getinfo() {
		log.info("sending Required info of HDfc customer");
	}

}
