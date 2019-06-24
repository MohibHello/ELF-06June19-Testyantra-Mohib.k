package com.testyantra.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public class Marker extends Pen {
	void color() {
		log.info("marker");
	}

}
