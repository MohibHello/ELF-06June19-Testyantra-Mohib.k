package com.testyantra.assignment.objects;

public class DriverTest {

	public static void main(String[] args) {

		LuxuryCar lc = new Audi();
		Driver d = new Driver();
		d.receive(lc);
	}
}
