package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ALStringItr {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("hello");
		al.add("hi");
		al.add("animal");
		al.add("wwe");
		al.add("java");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}
	}
}