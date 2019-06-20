package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistItr {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(13);
		al.add("hello");
		al.add("hey");
		al.add(12.5);
		al.add('a');
		al.add(null);

		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object ob = it.next();
			System.out.println(ob);
		}

	}

}
