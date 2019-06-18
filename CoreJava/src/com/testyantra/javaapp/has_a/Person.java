package com.testyantra.javaapp.has_a;

public class Person {

	Mobile m = new Mobile();
	Car c = new Car();
	int i = 6;

	void walk() {
		System.out.println("walking");
	}

	public static void main(String[] args) {

		/*
		 * Person p = new Person(); System.out.println(p.i); p.walk(); p.m.call();
		 */
		Car c = new Car();
		c.foward();
		c.reverse();
		System.out.println("Station channel is : " + c.m.station + "FM");
		System.out.println("Volume is : " + c.m.volume);
		c.m.turnOff();
		c.m.turnOn();
	}
}
