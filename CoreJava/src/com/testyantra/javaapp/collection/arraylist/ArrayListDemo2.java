package com.testyantra.javaapp.collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(13);
		al.add("hello");
		al.add("hey");
		al.add(12.5);
		al.add('a');
		al.add(null);

		for (Object ob : al) {
			System.out.println(ob);
		}

	}
}
