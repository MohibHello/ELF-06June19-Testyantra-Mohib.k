package com.testyantra.javaapp.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {

	private static final Logger l = Logger.getLogger("flipflop");

	void ConnectDB() {
		l.log(Level.FINE, "loging to DB");
		l.log(Level.SEVERE, "Logging failed");
		l.log(Level.WARNING, "not recog.");
	}

	void store() {
		l.log(Level.SEVERE, "data loss");
		l.log(Level.WARNING, "retry");
	}
}
