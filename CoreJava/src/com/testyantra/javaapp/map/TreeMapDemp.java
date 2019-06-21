package com.testyantra.javaapp.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemp {

	public static void main(String[] args) {

		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
		hm.put("one", 11);
		hm.put("hello", 50);
		hm.put("three", 33);
		hm.put("four", 44);

		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			String key = e.getKey();
			Integer val = e.getValue();

			System.out.println("Key --->" + key);
			System.out.println("value -->" + val);

		}
	}
}
