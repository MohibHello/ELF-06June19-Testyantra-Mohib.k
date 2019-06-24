package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class VendingMachine {
	public static void main(String[] args) {
		int input = 90;

		switch (input) {
		case 10:
			log.info("Lays");

			break;

		case 20:
			log.info("kurkure");
			break;

		case 50:
			log.info("dairyMilk");
			break;

		default:
			log.info("invalid Option");
			break;
		}
	}
}
