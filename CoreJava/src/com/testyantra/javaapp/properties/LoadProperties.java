package com.testyantra.javaapp.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class LoadProperties {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("demo.properties");
			Properties p = new Properties();
			p.load(fin);

			String name = p.getProperty("companyName");
			String number = p.getProperty("PhoneNumber");

			log.info("Name is :- " + name);
			log.info("number is :- " + number);

		} catch (IOException e) {
			log.info("" + e);
		}

	}
}
