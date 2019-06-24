package com.testyantra.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ArrayCopy {

	public static void main(String[] args) {
		int a[] = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		int destfromindex = 3;
		int sourcefromindex = 2;
		int numberofele = 2;
		int counter = 1;

		for (int i = destfromindex; i < b.length; i++) {
			b[i] = a[sourcefromindex++];

			if (counter == numberofele) {
				break;
			}
			counter++;
		}
		log.info("Contents of b[] ");
		for (int i = 0; i < b.length; i++)
			log.info(b[i] + " ");

		log.info("***************");

		System.arraycopy(a, 2, b, 3, 2);

		log.info("Contents of b[] ");
		for (int i = 0; i < b.length; i++)
			log.info(b[i] + " ");
	}
}
