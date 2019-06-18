package com.testyantra.javaapp.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FlipkartLogger {

	private static final Logger l = Logger.getLogger("flipflop");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		l.setLevel(Level.INFO);

		try {
			FileHandler fl = new FileHandler("Flipflop.log");
			fl.setLevel(Level.ALL);
			fl.setFormatter(new SimpleFormatter());
			l.addHandler(fl);

			Register r = new Register();
			l.log(Level.SEVERE, "connection lost");
			l.log(Level.FINEST, "connection working");
			r.ConnectDB();
			l.log(Level.SEVERE, "failed to store");
			l.log(Level.FINE, "working");
			r.store();

			Login l = new Login();
			l.navigate();
			l.validateUser();

		} catch (SecurityException | IOException e) {
			System.out.println("error");
		}
	}
}
