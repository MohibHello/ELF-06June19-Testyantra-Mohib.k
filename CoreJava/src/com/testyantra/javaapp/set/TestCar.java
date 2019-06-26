package com.testyantra.javaapp.collection.set;

import java.util.TreeSet;

public class TestCar {

	public static void main(String[] args) {

		TreeSet<Car> tr = new TreeSet<Car>();
		Car c1 = new Car();
		c1.name = "A1";
		c1.brand = "mercedes";
		c1.cost = 4000000;
		c1.rating = 4.5;

		Car c2 = new Car();
		c2.name = "B1";
		c2.brand = "ferrari";
		c2.cost = 9000000;
		c2.rating = 4.4;

		Car c3 = new Car();
		c3.name = "C1";
		c3.brand = "mclaren";
		c3.cost = 5600000;
		c3.rating = 4.1;

		Car c4 = new Car();
		c4.name = "D12";
		c4.brand = "Audi";
		c4.cost = 3300000;
		c4.rating = 3.5;

		Car c5 = new Car();
		c5.name = "Z123";
		c5.brand = "Lamborgini";
		c5.cost = 77887000;
		c5.rating = 5.0;

		tr.add(c1);
		tr.add(c2);
		tr.add(c3);
		tr.add(c4);
		tr.add(c5);

		for (Car c : tr) {
			System.out.println(c.name);
			System.out.println(c.brand);
			System.out.println(c.rating);
			System.out.println(c.cost);
			System.out.println("****************");
		}

	}
}
