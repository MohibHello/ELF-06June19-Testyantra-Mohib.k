package com.tyss.springcore.program;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal {

	@Override
	public void eat() {
		log.info("eating banana");
	}

	@Override
	public void makeSound() {
		log.info("monkey making sound");
	}

}
