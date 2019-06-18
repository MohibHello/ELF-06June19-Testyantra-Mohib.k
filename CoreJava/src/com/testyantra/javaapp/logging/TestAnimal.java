package com.testyantra.javaapp.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestAnimal {

	private static final Logger log = Logger.getLogger("mike");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		log.setLevel(Level.ALL);

		Cow c = new Cow();
		Lion l = new Lion();

		try {
			FileHandler e = new FileHandler("newfile.log");
			e.setLevel(Level.CONFIG);
			e.setFormatter(new SimpleFormatter());
			log.addHandler(e);

			c.sound();
			c.div(10, 5);

			l.sound();
			l.div(50, 5);

		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}

	}
}
