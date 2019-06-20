package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;

public class ALString {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("hello");
		al.add("hi");
		al.add("animal");
		al.add("wwe");
		al.add("java");

		for (int i = 0; i < al.size(); i++) {
			String s = al.get(i);
			System.out.println(s);
		}
	}
}
