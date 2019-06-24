package com.testyantra.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Const {
	public Const() {
		log.info("this a constructor");
	}

	public Const(int x) {
		log.info("" + x);
	}

	public Const(double s) {
		log.info("" + s);
	}

	public static void main(String[] args) {

		new Const();
		new Const(5);
		new Const(5.5);

	}
}
