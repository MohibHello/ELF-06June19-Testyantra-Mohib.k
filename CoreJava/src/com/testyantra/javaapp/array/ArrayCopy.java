package com.testyantra.javaapp.array;

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

		System.out.println("Contents of b[] ");
		for (int i = 0; i < b.length; i++)
			System.out.println(b[i] + " ");

		System.out.println("***************");

		System.arraycopy(a, 2, b, 3, 2);

		System.out.println("Contents of b[] ");
		for (int i = 0; i < b.length; i++)
			System.out.println(b[i] + " ");
	}
}
