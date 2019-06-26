package com.testyantra.javaapp.enums;

import lombok.extern.java.Log;

@Log
public class TestGender {
	public static void main(String[] args) {

		log.info("" + Gender.MALE);
		log.info("" + Gender.OTHER.ordinal());

		Gender g = Gender.MALE;

		switch (g) {
		case MALE:
			log.info("male");
			break;
		case FEMALE:
			log.info("female");
			break;
		case OTHER:
			log.info("others");
			break;
		}

	}
}
