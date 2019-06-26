package com.testyantra.assignment.objects;

import lombok.extern.java.Log;

@Log
public class Gun {

	Gun() {
		log.info("Gun with 0 bullets");
	}

	Gun(int bullets) {
		log.info("Gun with bullets");
	}

}
