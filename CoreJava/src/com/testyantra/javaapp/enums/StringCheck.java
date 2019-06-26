package com.testyantra.javaapp.enums;

import lombok.extern.java.Log;

@Log
public class StringCheck {

	public static void main(String[] args) {

		String s = "hey";

		switch (s) {
		case "hello":
			log.info("Hello man");
			break;
		case "hey":
			log.info("hey man");
			break;
		default:
			log.info("what man");
			break;
		}
	}
}
