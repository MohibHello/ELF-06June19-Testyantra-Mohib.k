package com.testyantra.javaapp.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(5);
		ll.add(12.4);
		ll.add("hello");
		ll.add(1);
		ll.add('A');
		System.out.println("--------------");
		for (int i = 0; i < ll.size(); i++) {

			Object ob = ll.get(i);
			System.out.println(ob);
		}
		System.out.println("--------------");
		for (Object object : ll) {
			System.out.println(object);
		}
		System.out.println("--------------");
		Iterator it = ll.iterator();

		while (it.hasNext()) {
			Object object = it.next();
			System.out.println(object);

		}
		System.out.println("--------------");
		ListIterator llt = ll.listIterator();
		while (llt.hasNext()) {
			Object object = (Object) llt.next();
			System.out.println(object);

		}
	}
}
