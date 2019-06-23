package com.testyantra.assignment.collection;

import lombok.extern.java.Log;

@Log
public class DemoObject {

	static int noOfObjects = 0;

	public DemoObject() {
		noOfObjects++;
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		DemoObject d1 = new DemoObject();
		DemoObject d2 = new DemoObject();
		DemoObject d3 = new DemoObject();

		log.info("Number of Object creatd:" + DemoObject.noOfObjects);
	}
}
