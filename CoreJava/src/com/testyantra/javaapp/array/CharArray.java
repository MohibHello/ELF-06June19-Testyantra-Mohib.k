package com.testyantra.javaapp.array;

public class CharArray {
	public static void main(String[] args) {

		char[] ch = new char[5];
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		ch[3] = 'd';
		ch[4] = 'e';

		for (int i = 0; i < ch.length; i++) {
			System.out.println("element no." + i + " " + ch[i]);
		}
		System.out.println(ch.length);
	}
}
