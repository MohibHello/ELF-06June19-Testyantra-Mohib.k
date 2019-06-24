package com.testyantra.javaapp.exception;

import lombok.extern.java.Log;

@Log
public class Paytm extends KSRTC {

	KSRTC k = new KSRTC();

	void bookTicket() {

		log.info("Booking ticket");
		k.ticket();
		log.info("Booking ");

	}
}
