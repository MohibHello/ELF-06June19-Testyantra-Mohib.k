package com.testyantra.javaapp.thread;

public class PVRTest {

	public static void main(String[] args) {

		PVR p = new PVR();
		Browser b = new Browser(p);
		b.start();
		Browser b2 = new Browser(p);
		b2.start();
		Browser b3 = new Browser(p);
		b3.start();

		p.leave();
	}
}
