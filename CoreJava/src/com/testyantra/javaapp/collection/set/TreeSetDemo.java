package com.testyantra.javaapp.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
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
			log.info("" + ob);
		}
		log.info("--------------");
		Iterator it = t.iterator();

		while (it.hasNext()) {
			Object object = it.next();
			log.info("" + object);

		}
	}
}
