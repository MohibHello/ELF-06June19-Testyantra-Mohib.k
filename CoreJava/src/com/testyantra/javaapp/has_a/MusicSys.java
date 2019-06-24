package com.testyantra.javaapp.has_a;
import lombok.extern.java.Log;

@Log
public class MusicSys {

	double station = 93.5;
	double volume = 5.5;

	void turnOn() {
		log.info("Turning Music On");
	}

	void turnOff() {
		log.info("Turning Music OFF");
	}
}
