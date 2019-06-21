package com.testyantra.javaapp.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("one", 11);
		hm.put("two", 20);
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
