package com.testyantra.javaapp.runnable;

public class MarkerTest {

	public static void main(String[] args) {

		Marker m = new Marker();
		Thread t = new Thread(m);
		t.start();
		Thread t2 = new Thread(m);
		t2.start();

	}
}
