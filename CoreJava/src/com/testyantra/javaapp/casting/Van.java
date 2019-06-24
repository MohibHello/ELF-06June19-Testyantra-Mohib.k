package com.testyantra.javaapp.casting;
import lombok.extern.java.Log;

@Log
public class Van extends Bus {

	int seat = 6;

	void turn() {
		log.info("Child Member");
	}
}
