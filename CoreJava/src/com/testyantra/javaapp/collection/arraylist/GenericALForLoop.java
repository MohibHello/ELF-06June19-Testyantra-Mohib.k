package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;

public class GenericALForLoop {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(12.2);
		al.add(2.3);

		for (int i = 0; i < al.size(); i++) {
			Double r = al.get(i);
			System.out.println(r);
		}
	}
}
