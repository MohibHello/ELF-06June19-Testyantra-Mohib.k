package com.testyantra.javaapp.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestA {

	private static final Logger loger = Logger.getLogger("hello");

	void buy() {
		loger.log(Level.FINEST, "all is well");
		loger.log(Level.SEVERE, "Danger Servere Death ");
		loger.log(Level.WARNING, "warning road blocked");
		loger.log(Level.INFO, "hi this is just a Info");
		loger.log(Level.CONFIG, "this a config Level");
		loger.log(Level.FINEST, "all is well");
	}
}
