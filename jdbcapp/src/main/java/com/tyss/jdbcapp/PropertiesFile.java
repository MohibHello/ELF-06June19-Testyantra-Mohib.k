package com.tyss.jdbcapp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class PropertiesFile {

	public static void main(String[] args) {

		FileOutputStream fout;
		try {
			fout = new FileOutputStream("db.properties");
			Properties p = new Properties();
			p.setProperty("dburl", "jdbc:mysql://localhost:3306/testyantra_db");
			p.setProperty("user", "root");
			p.setProperty("password", "root");
			p.setProperty("driverclassNM", "com.mysql.jdbc.Driver");

			p.store(fout, "Company details");
			log.info("created");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
