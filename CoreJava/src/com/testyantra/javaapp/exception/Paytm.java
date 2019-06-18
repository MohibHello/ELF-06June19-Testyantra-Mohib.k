package com.testyantra.javaapp.exception;

public class Paytm extends KSRTC {

	KSRTC k = new KSRTC();

	void bookTicket() {

		System.out.println("Booking ticket");
		k.ticket();
		System.out.println("Booking ");

	}
}
