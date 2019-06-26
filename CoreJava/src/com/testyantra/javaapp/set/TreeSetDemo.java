package com.testyantra.javaapp.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
//		t.add("hello");
		t.add(122);
		t.add(12);
//		t.add("helo");
		t.add(45);
//		t.add('E');

		for (Object ob : t) {
			System.out.println(ob);
		}
		System.out.println("--------------");
		Iterator it = t.iterator();

		while (it.hasNext()) {
			Object object = it.next();
			System.out.println(object);

		}
	}
}
