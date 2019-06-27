package com.testyantra.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class PersonalProperties {

	public static void main(String[] args) {

		try {
			FileOutputStream fout = new FileOutputStream("demo.properties");

			Properties p = new Properties();
			p.setProperty("Name", "mohib");
			p.setProperty("PhoneNumber", "542356");

			p.store(fout, "Company details");
			log.info("created");

		} catch (FileNotFoundException e) {
			log.info("" + e);
		} catch (IOException e) {
			log.info("IOE" + e);
		}
	}
}
