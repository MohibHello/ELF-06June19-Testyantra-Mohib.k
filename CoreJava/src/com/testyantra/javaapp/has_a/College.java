package com.testyantra.javaapp.has_a;
import lombok.extern.java.Log;

@Log
public class College {

	static Student s = new Student();

	void info() {
		log.info("info");
	}
}
