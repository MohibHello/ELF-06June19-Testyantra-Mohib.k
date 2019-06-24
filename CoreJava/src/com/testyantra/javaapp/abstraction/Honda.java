package com.testyantra.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public abstract class Honda {
	void engine() {
		log.info("ss");
	}

	abstract void design();
}
