package com.testyantra.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class DoorTest {

	static void open() {
		log.info("*********open*******");
		log.info("logic to open door");
	}

	public static void main(String[] args) {

		Door d = DoorTest::open;

		d.room();
	}
}
