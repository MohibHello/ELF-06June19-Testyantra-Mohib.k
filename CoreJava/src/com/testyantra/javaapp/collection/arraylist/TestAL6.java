package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;

public class TestAL6 {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);

		ArrayList<Double> al2 = new ArrayList<Double>();
		al2.add(56.2);
		al2.add(13.5);
		System.out.println("before---->" + al);

		al.addAll(al2);

		System.out.println("after----->" + al);
	}
}
