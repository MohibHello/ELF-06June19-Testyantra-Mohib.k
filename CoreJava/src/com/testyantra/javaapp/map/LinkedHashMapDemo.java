package com.testyantra.javaapp.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
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
