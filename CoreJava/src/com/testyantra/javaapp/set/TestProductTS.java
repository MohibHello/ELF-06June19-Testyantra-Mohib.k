package com.testyantra.javaapp.collection.set;

import java.util.TreeSet;

public class TestProductTS {

	public static void main(String[] args) {

		TreeSet<Product> tr = new TreeSet<Product>();
		Product p1 = new Product();

		p1.id = 1;
		p1.cost = 5.0;
		p1.rating = 2.7;

		Product p2 = new Product();

		p2.id = 2;
		p2.cost = 11.0;
		p2.rating = 4.7;

		Product p3 = new Product();

		p3.id = 5;
		p3.cost = 6.0;
		p3.rating = 2.4;
		Product p4 = new Product();

		p4.id = 4;
		p4.cost = 45.7;
		p4.rating = 1.8;
		Product p5 = new Product();

		p5.id = 3;
		p5.cost = 100.0;
		p5.rating = 5.0;

		tr.add(p1);
		tr.add(p2);
		tr.add(p3);
		tr.add(p4);
		tr.add(p5);

		for (Product p : tr) {
			System.out.println("ID : " + p.id);
			System.out.println("Cost : " + p.cost);
			System.out.println("Rating : " + p.rating);
		}
	}
}
