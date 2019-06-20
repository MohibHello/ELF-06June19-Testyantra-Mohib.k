package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;

public class TestAL5 {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);

		System.out.println("before---->" + al);

		al.remove(2.4);
		al.remove(44.6);
		System.out.println("after----->" + al);
	}
}
