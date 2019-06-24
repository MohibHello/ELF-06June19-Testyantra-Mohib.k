package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class SeniorDiscount {
	public static void main(String[] args) {

		double price = 100;
		boolean issenior = false;
		double discount = 15.2;

		if (issenior) {
			price = price - (price * discount) / 100;
		}
		log.info("price of ticket :- " + price);
	}
}
