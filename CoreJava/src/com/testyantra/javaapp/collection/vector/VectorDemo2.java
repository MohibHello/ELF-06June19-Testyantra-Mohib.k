package com.testyantra.javaapp.collection.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(4);
		v.add(5);
		v.add(7);
		v.add(12);

		for (int i = 0; i < v.size(); i++) {

			Object ob = v.get(i);
			System.out.println(ob);
		}
		System.out.println("--------------");
		for (Object ob : v) {
			System.out.println(ob);
		}
		System.out.println("--------------");
		Iterator<Integer> it = v.iterator();

		while (it.hasNext()) {
			Object object = it.next();
			System.out.println(object);

		}
		System.out.println("--------------");
		ListIterator<Integer> llt = v.listIterator();
		while (llt.hasNext()) {
			Object object = llt.next();
			System.out.println(object);
		}
		System.out.println("-----------");
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer integer = e.nextElement();
			System.out.println(integer);
		}
	}
}
