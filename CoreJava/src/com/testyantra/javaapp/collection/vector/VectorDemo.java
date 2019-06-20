package com.testyantra.javaapp.collection.vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(1);
		v.add("333");
		v.add("556");
		v.add('A');
		v.add(12.4);

		for (int i = 0; i < v.size(); i++) {

			Object ob = v.get(i);
			System.out.println(ob);
		}
		System.out.println("--------------");
		for (Object ob : v) {
			System.out.println(ob);
		}
		System.out.println("--------------");
		Iterator it = v.iterator();

		while (it.hasNext()) {
			Object object = it.next();
			System.out.println(object);

		}
		System.out.println("--------------");
		ListIterator llt = v.listIterator();
		while (llt.hasNext()) {
			Object object = llt.next();
			System.out.println(object);
		}
	}
}
