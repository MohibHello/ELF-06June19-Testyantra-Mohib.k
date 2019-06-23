package com.testyantra.assignment.objects;

public class Driver {

	void receive(LuxuryCar c) {
		if (c instanceof Benz) {
			System.out.println("received Benz gone for Drive");
		} else if (c instanceof Audi) {
			System.out.println("received Audi gone for Drive");
		}
	}
}
