package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class Language {
	public static void main(String[] args) {

		log.info("enter a Number to select a language");
		int num = 5;

		switch (num) {
		case 1:
			log.info("Kannada Selected");
			break;
		case 2:
			log.info("English Selected");
			break;
		case 3:
			log.info("hindi Selected");
			break;
		case 4:
			log.info("tamil Selected");
			break;
		default:
			log.info("invalid Option");
			break;

		}

	}
}
