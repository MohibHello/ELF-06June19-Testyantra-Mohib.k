package com.testyantra.javaapp.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo2 {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(189);
		t.add(122);
		t.add(12);
		t.add(11);
		t.add(45);
		t.add(67);
		t.add(11);

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
