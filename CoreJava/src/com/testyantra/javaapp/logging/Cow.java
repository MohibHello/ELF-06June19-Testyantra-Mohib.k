package com.testyantra.javaapp.logging;

import java.util.logging.Logger;

public class Cow extends Animal {
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger("mike");

	void sound() {
		System.out.println("Hamba");
	}
}
