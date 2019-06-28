package com.testyantra.javaapp.collection.set;

import java.util.HashSet;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class HashSetDemo {

	public static void main(String[] args) {

		HashSet h = new HashSet();
		h.add(1);
		h.add(12);
		h.add("hello");
		h.add(45);
		h.add('E');

		for (Object ob : h) {
			log.info("" + ob);
		}
		log.info("--------------");
		Iterator it = h.iterator();

		while (it.hasNext()) {
			Object object = it.next();
			log.info("" + object);

		}
	}
}
