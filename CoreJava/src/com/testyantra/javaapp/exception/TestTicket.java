package com.testyantra.javaapp.exception;

public class TestTicket {

	public static void main(String[] args) {

		System.out.println("Main started");
		Paytm p = new Paytm();

		p.bookTicket();

		System.out.println("Main Ended");
	}
}
