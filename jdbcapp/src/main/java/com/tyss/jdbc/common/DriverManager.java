package com.tyss.jdbc.common;

import lombok.extern.java.Log;

@Log
public class DriverManager {

	private DriverManager() {

	}

	public static Connection getConnection(String str) {
		Connection ref = null;
		if (str.equals("One")) {
			ref = new ClassA();
		} else {
			ref = new ClassB();
		}
		return ref;
	}
}
