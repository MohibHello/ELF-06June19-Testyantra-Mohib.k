package com.testyantra.javaapp.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import lombok.extern.java.Log;

@Log
public class HashMapDemo2 {
	public static void main(String[] args) {

		HashMap<Character, Double> hm = new HashMap<Character, Double>();
		hm.put('c', 11.2);
		hm.put('a', 50.5);
		hm.put('e', 33.6);
		hm.put('d', 44.9);

		for (Map.Entry<Character, Double> e : hm.entrySet()) {
			Character key = e.getKey();
			Double val = e.getValue();

			log.info("Key --->" + key);
			log.info("value -->" + val);

		}

		Set<Character> s = hm.keySet();
		for (Character c : s) {
			System.out.println("Key :-  " + c);
		}

		Collection<Double> ci = hm.values();
		Iterator<Double> ii = ci.iterator();

		while (ii.hasNext()) {
			Double double1 = ii.next();
			log.info(""+double1);
		}

	}
}