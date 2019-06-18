package com.testyantra.javaapp.has_a;

public class Car {

	MusicSys m = new MusicSys();

	void foward() {
		System.out.println("moving front");
	}

	void reverse() {
		System.out.println("going back");
	}

}
