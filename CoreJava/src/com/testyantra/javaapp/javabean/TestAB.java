package com.testyantra.javaapp.javabean;

public class TestAB {
	public static void main(String[] args) {

		Person p = new Person();
		p.setAge(10);
		p.setName("john cena");

		DB1 d1 = new DB1();
		DB2 d2 = new DB2();

		d1.receive(p);

		System.out.println("Alternative");

		d2.receive(p);
	}
}
