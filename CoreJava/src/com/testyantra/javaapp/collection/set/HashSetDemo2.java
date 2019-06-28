package com.testyantra.javaapp.collection.set;

import java.util.HashSet;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class HashSetDemo2 {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(12);
		h.add(15);
		h.add(45);
		h.add(99);

		for (Integer ob : h) {
			log.info("" + ob);
		}
		log.info("--------------");
		Iterator<Integer> it = h.iterator();

		while (it.hasNext()) {
			Object object = it.next();
			log.info("" + object);

		}
	}
}
