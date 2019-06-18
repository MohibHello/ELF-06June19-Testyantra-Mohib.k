package com.testyantra.javaapp.javabean;

public class Marker {

	final private static Marker m = new Marker();

	private Marker() {

	}

	public static Marker getMarker() {
		return m;
	}
}
