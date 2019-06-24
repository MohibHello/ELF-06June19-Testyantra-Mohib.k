package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class Average {
	public static void main(String[] args) {
		int subject1 = 20;
		int subject2 = 23;
		int subject3 = 22;

		log.info("" + (subject1 + subject2 + subject3) / (double) 3);
	}
}
