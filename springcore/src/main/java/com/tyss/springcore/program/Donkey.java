package com.tyss.springcore.program;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal {

	@Override
	public void eat() {
		log.info("donkey eating");
	}

	@Override
	public void makeSound() {
		log.info("donkey making sound");
	}

}
