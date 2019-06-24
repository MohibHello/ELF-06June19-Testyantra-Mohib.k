package com.testyantra.javaapp.exception;

import lombok.extern.java.Log;

@Log
public class TestTicket {

	public static void main(String[] args) {

		log.info("Main started");
		Paytm p = new Paytm();

		p.bookTicket();

		log.info("Main Ended");
	}
}
