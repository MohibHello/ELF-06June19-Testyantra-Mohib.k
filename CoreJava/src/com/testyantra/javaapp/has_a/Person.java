package com.testyantra.javaapp.has_a;
import lombok.extern.java.Log;

@Log
public class Person {

	Mobile m = new Mobile();
	Car c = new Car();
	int i = 6;

	void walk() {
		log.info("walking");
	}

	public static void main(String[] args) {

		/*
		 * Person p = new Person(); log.info(p.i); p.walk(); p.m.call();
		 */
		Car c = new Car();
		c.foward();
		c.reverse();
		log.info("Station channel is : " + c.m.station + "FM");
		log.info("Volume is : " + c.m.volume);
		c.m.turnOff();
		c.m.turnOn();
	}
}
