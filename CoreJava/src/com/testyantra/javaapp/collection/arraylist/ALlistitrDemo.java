package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ALlistitrDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(13);
		al.add("hello");
		al.add("hey");
		al.add(12.5);
		al.add('a');
		al.add(null);

		ListIterator lit = al.listIterator(al.size());
		while (lit.hasPrevious()) {
			Object object = lit.previous();
			System.out.println(object);
		}

	}
}
