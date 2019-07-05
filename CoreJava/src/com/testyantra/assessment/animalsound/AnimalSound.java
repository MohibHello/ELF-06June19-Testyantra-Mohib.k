package com.testyantra.java.assessment.animalsound;

import lombok.extern.java.Log;

@Log
public class AnimalSound {

	void receive(Animal a) {
		if (a instanceof GoatAnimal) {
			log.info("bahaaaa");
		} else if (a instanceof CowAnimal) {
			log.info("hambaaaa");
		}
	}
}
