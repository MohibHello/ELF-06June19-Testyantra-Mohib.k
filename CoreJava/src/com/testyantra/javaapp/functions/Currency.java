package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class Currency {
	public static void main(String[] args) {

		double dollar = 69.55;
		double euro = 78.58;
		euro++;

		log.info("1000 rupee is equivalent to " + (1000 / dollar) + " Dollars");
		log.info("1000 rupee is equivalent to " + (1000 / euro) + " Euro");
	}
}
