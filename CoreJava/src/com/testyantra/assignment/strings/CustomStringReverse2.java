package com.testyantra.assignment.strings;

public class CustomStringReverse2 {
	public static void main(String[] args) {

		String s = "how are you doing";

		strcount(s);
	}

	public static void strcount(String s1) {
		char[] ch = s1.toCharArray();
		String res = "";
		for (int i = 0; i < ch.length; i++) {
			String out = "";

			while (i < ch.length && ch[i] != ' ') {
				out = ch[i] + out;
				i++;
			}
			res = res + " " + out;
		}
		System.out.println(res);
	}
}
