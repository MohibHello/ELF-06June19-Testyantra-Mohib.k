package com.testyantra.javaapp.has_a;
import lombok.extern.java.Log;

@Log
public class Car {

	MusicSys m = new MusicSys();

	void foward() {
		log.info("moving front");
	}

	void reverse() {
		log.info("going back");
	}

}
