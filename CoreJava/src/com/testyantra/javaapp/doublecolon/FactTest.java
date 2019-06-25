package com.testyantra.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class FactTest {

	public static void main(String[] args) {

		MyStudent s = new MyStudent();
		MyFactorial f = s::fact;

		int i = f.getFact(5);
		log.info("" + i);
	}
}
