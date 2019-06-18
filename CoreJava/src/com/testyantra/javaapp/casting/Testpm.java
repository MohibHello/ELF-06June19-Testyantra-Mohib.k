package com.testyantra.javaapp.casting;

public class Testpm {

	public static void main(String[] args) {

		Pen p = new Marker();
		System.out.println(p.cost);

		p.write();

		Marker m = (Marker) p;
		System.out.println(m.cost);
		System.out.println(m.size);

		m.color();
		m.write();

	}
}
