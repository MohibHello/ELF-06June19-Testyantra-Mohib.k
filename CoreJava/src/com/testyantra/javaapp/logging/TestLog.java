package com.testyantra.javaapp.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestLog {

	private static final Logger loger = Logger.getLogger("hello");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		try {
			FileHandler f = new FileHandler("savefil.log");
			f.setLevel(Level.ALL);
			f.setFormatter(new SimpleFormatter());
			loger.addHandler(f);

			loger.log(Level.FINEST, "all is well");
			loger.log(Level.SEVERE, "Danger Servere Death ");
			loger.log(Level.WARNING, "warning road blocked");
			loger.log(Level.INFO, "hi this is just a Info");
			loger.log(Level.CONFIG, "this a config Level");
			loger.log(Level.FINEST, "all is well");

			TestA ta = new TestA();
			ta.buy();
			System.out.println("done");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
