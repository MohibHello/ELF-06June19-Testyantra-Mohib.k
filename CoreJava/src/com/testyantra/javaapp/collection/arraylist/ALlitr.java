package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ALlitr {
	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(12.2);
		al.add(2.3);
		al.add((double) 4);

		ListIterator<Double> it = al.listIterator();
		while (it.hasNext()) {
			Double d = it.next();
			System.out.println(d);
		}
		System.out.println("backward");
		while (it.hasPrevious()) {
			Double d1 = it.previous();
			System.out.println(d1);
		}

	}
}
