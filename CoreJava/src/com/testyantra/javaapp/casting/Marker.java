package com.testyantra.javaapp.casting;
import lombok.extern.java.Log;

@Log
public class Marker extends Pen {

	double size = 12.4;

	void color() {
		log.info("Child Member");
	}
}
