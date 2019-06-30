package com.testyantra.assignment.streamandproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class PropertiesLoadOperation {
	public static void main(String[] args) {

		try (FileInputStream fin = new FileInputStream("demo.properties");) {

			Properties p = new Properties();
			p.load(fin);

			String name = p.getProperty("Name");
			String number = p.getProperty("PhoneNumber");

			log.info("Loaded");
			log.info("Name is :- " + name);
			log.info("number is :- " + number);

		} catch (FileNotFoundException e) {
			log.info("" + e);
		} catch (IOException e) {
			log.info("IOE" + e);
		}
	}
}
