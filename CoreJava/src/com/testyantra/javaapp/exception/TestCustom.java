package com.testyantra.javaapp.exception;

import lombok.extern.java.Log;

@Log
public class TestCustom {

	public static void main(String[] args) {

		log.info("main started");
		StringValidate s = new StringValidate();
		try {
			s.validate("hey");
		} catch (CustomException e) {
			log.info(e.getMessage());
		}
		log.info("main ended");

	}
}
