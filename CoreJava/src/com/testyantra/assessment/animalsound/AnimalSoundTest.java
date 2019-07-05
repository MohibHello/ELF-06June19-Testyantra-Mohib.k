package com.testyantra.java.assessment.animalsound;

public class AnimalSoundTest {

	public static void main(String[] args) {

		GoatAnimal goat = new GoatAnimal();
		CowAnimal cow = new CowAnimal();
		AnimalSound sound = new AnimalSound();

		sound.receive(goat);
		sound.receive(cow);
	}
}
