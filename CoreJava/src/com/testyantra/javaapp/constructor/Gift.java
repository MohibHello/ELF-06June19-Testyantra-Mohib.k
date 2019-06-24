package com.testyantra.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Gift {
	void receive(Phone p) {
		if (p instanceof IPhone) {
			log.info("i love u");
		} else {
			log.info("thk u bro");
		}
	}
}