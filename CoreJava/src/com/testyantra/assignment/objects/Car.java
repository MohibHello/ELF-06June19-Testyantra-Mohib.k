package com.testyantra.assignment.objects;

import lombok.extern.java.Log;

@Log
public class Car {

	Car() {
		log.info("No Fuel");

	}

	Car(double fuel) {
		log.info("Car with initial Fuel");
	}
}
