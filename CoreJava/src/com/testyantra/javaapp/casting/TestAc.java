package com.testyantra.javaapp.casting;

public class TestAc {

	public static void main(String[] args) {

		Animal a = new Cow();
		System.out.println(a.x);
		a.run();

		Cow c = (Cow) a;
		System.out.println(c.c);
		System.out.println(c.x);
		c.eat();
		c.run();
	}
}
