package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ALItr {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(12.2);
		al.add(2.3);
		al.add((double) 4);

		Iterator<Double> it = al.iterator();
		while (it.hasNext()) {
			Double d = it.next();
			System.out.println(d);

		}
	}
}
