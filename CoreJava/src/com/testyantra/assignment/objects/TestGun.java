package com.testyantra.assignment.objects;

import lombok.extern.java.Log;

@Log
public class TestGun {

	public static void main(String[] args) {

		Gun g = new Gun(30);
		log.info("" + g);
	}
}
