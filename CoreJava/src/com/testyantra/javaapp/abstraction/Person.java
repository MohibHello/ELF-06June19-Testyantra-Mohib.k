package com.testyantra.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public class Person implements Animal, Human {

	public void walk() {
		log.info("walking");
	}

	public void eat() {
		log.info("eating");
	}

}
