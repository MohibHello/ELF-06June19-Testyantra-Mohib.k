package com.testyantra.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class ConstInit {

	String name;
	int age;
	double percentage;

	public ConstInit(String n, int a, double per) {
		name = n;
		age = a;
		percentage = per;
	}

	void display() {
		log.info("Name :- " + name);
		log.info("Age :- " + age);
		log.info("percentage :- " + percentage);

	}

	public static void main(String[] args) {

		ConstInit con = new ConstInit("amit", 45, 55.5);
		con.display();
		log.info("*************");
		ConstInit con2 = new ConstInit("rahul", 33, 77);
		con2.display();
	}
}
