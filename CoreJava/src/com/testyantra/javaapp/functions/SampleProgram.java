package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class SampleProgram {

	int a = 100;
	String h = "ok";

	void check() {
		int a1 = 10;
		String str = "1233";

		log.info(a1 + "" + str);

	}

	void hello() {
		log.info("hello");
	}
}
