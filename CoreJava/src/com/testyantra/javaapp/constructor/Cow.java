package com.testyantra.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Cow extends Animals {
	void eat() {
		log.info("eating grass");
	}
}
