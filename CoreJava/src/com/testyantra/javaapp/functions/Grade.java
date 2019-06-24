package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class Grade {
	public static void main(String[] args) {
		double per = 60.9;

		if (per >= 70) {
			log.info("Grade A");
		} else if (per >= 60) {
			log.info("Grade B");
		} else if (per >= 50) {
			log.info("Grade C");
		} else {
			log.info("Fail");
		}

	}
}
