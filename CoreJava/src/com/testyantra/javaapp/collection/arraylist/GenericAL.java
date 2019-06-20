package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;

public class GenericAL {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(12.2);
		al.add(2.3);

		for (Double double1 : al) {
			System.out.println(double1);
		}

	}
}
