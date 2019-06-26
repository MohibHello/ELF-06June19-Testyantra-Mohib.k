package com.testyantra.assignment.objects;

import lombok.extern.java.Log;

@Log
public class Driver {

	void receive(LuxuryCar c) {
		if (c instanceof Benz) {
			log.info("received Benz gone for Drive");
		} else if (c instanceof Audi) {
			log.info("received Audi gone for Drive");
		}
	}
}
