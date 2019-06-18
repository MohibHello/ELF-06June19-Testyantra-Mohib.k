package com.testyantra.javaapp.javabean;

public class TestM {
	public static void main(String[] args) {

		Marker m = Marker.getMarker();
		System.out.println(m.hashCode());
		Marker t = m;
		System.out.println(t.hashCode());
		Marker tt = Marker.getMarker();

		System.out.println(tt.hashCode());
	}
}
