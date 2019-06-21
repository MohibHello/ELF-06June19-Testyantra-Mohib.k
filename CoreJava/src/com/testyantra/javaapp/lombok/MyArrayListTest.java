package com.testyantra.javaapp.lombok;

import java.util.logging.Logger;

public class MyArrayListTest {

	private static final Logger L = Logger.getLogger("array");

	static long starttime = System.currentTimeMillis();

	public static void main(String[] args) {

		MyArrayList ma = new MyArrayList();
		int dataSize = 17;

		L.info("Star " + starttime);
		for (int i = 0; i < dataSize; i++) {
			ma.add("value :" + i);
		}
		/* ma.remove(30); */

		for (int i = 0; i < dataSize; i++) {
			L.info("reterive elemt :- " + ma.get(i));
		}

		L.info("size" + ma.size());

	}
}
