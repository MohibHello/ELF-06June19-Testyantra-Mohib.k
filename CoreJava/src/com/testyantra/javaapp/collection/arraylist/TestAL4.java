package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;

public class TestAL4 {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);

		System.out.println("before---->" + al);

		Object ref = al.remove(1);
		System.out.println("obj removed :- " + ref);

		System.out.println("after----->" + al);
	}
}
