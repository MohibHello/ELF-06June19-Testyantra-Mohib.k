package com.testyantra.javaapp.casting;
import lombok.extern.java.Log;

@Log
public class Cow extends Animal {

	int c = 12;

	void eat() {
		log.info("child Member");
	}
}
