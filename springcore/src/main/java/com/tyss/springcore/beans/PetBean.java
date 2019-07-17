package com.tyss.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.program.Animal;

@Configuration
public class PetBean {

	private String name;

//	@Qualifier("monkey")
	@Autowired
	private Animal animal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void doSomthing() {
		animal.eat();
		animal.makeSound();
	}
}
