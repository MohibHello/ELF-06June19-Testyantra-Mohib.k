package com.testyantra.javaapp.array;

public class StringArray {
	public static void main(String[] args) {
		String[] ch = new String[5];
		ch[0] = "john cena";
		ch[1] = "orton";
		ch[2] = "roman";
		ch[3] = "delta";
		ch[4] = "elf";

		for (int i = 0; i < ch.length; i++) {
			System.out.println("element no." + (i + 1) + " " + ch[i]);
		}
		System.out.println(ch.length);
	}
}
