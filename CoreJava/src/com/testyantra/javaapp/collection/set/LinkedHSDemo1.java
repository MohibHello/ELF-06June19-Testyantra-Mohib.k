package com.testyantra.javaapp.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

import lombok.extern.java.Log;

@Log
public class LinkedHSDemo1 {

	public static void main(String[] args) {

		LinkedHashSet h = new LinkedHashSet();
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
