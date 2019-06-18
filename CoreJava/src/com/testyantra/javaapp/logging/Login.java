package com.testyantra.javaapp.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

	private static final Logger l = Logger.getLogger("flipflop");

	void validateUser() {
		l.log(Level.FINE, "logging in");
		l.log(Level.SEVERE, "invalid user");
	}

	void navigate() {
		l.log(Level.WARNING, "cannot navigate");
	}
}
