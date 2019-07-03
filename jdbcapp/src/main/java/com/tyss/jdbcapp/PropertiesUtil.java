package com.tyss.jdbcapp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	private static PropertiesUtil util = null;
	Properties properties = null;

	public static PropertiesUtil getPropertyUtil() throws Exception {
		if (util == null) {
			util = new PropertiesUtil();
		}
		return util;
	}

	private PropertiesUtil() throws IOException {

		properties = new Properties();
		properties.load(new FileInputStream("db.properties"));
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}
