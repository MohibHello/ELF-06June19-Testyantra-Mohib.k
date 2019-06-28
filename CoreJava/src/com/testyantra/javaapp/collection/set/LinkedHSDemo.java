package com.testyantra.javaapp.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

import lombok.extern.java.Log;

@Log
public class LinkedHSDemo {

	public static void main(String[] args) {

		LinkedHashSet<Double> h = new LinkedHashSet<Double>();
		h.add(1.1);
		h.add(12.6);
		h.add(15.7);
		h.add(45.9);
		h.add(99.4);

		for (Double ob : h) {
			log.info("" + ob);
		}
		log.info("--------------");
		Iterator<Double> it = h.iterator();

		while (it.hasNext()) {
			Object object = it.next();
			log.info("" + object);

		}
	}
}
