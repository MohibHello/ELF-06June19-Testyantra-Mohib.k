package com.testyantra.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class Pen {

	public Pen() {
		log.info("Called");
	}

	public void write() {
		log.info("write");
	}
}
