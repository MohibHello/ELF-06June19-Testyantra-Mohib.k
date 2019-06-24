package com.testyantra.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public abstract class Pen extends Pencil {

	void write() {
		log.info("write");
	}

}
