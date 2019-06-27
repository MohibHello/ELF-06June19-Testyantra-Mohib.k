package com.testyantra.javaapp.doublecolon;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString
@Log
public class Pen {

	public Pen() {
		log.info("Called");
	}

	public void write(int x) {
		log.info("write");
	}

}
