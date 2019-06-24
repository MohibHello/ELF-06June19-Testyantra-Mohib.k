package com.testyantra.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public abstract class Pencil {

	void draw() {
		log.info("draw");
	}

	abstract void write();

	abstract void color();
}
