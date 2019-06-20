package com.testyantra.javaapp.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("hello");
		ll.add("mohib");
		ll.add("mahesh");
		ll.add("sachin");
		ll.add("yuvi");
		for (int i = 0; i < ll.size(); i++) {

			String ob = ll.get(i);
			System.out.println(ob);
		}
		System.out.println("--------------");
		for (String ob : ll) {
			System.out.println(ob);
		}
		System.out.println("--------------");
		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			Object object = it.next();
			System.out.println(object);

		}
		System.out.println("--------------");
		ListIterator<String> llt = ll.listIterator();
		while (llt.hasNext()) {
			Object object = llt.next();
			System.out.println(object);

		}
	}
}
