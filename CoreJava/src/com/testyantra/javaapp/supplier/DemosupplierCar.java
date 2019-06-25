package com.testyantra.javaapp.supplier;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class DemosupplierCar {

	public static void main(String[] args) {

		Supplier<Car> c = () -> new Car(15.6);

		Car cc = c.get();

		log.info("Car initial fuel :- " + cc.fuel);
	}
}
