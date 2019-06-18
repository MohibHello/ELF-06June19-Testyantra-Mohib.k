package com.testyantra.javaapp.casting;

public class TestCV {

	public static void main(String[] args) {

		Bus b = new Van();
		b.move();
		System.out.println(b.model);

		Van v = (Van) b;
		System.out.println(v.model);
		System.out.println(v.seat);
		v.turn();
		v.move();

	}
}
