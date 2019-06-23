package com.testyantra.assignment.strings;

public class CustomStringReverse {
	public static void main(String[] args) {

		String s = "hi my dear friends";

		strcount(s);
	}

	public static void strcount(String s1) {
		char[] ch = s1.toCharArray();
		String res = "";
		for (int i = 0; i < ch.length; i++) {
			String out = "";

			while (i < ch.length && ch[i] != ' ') {
				out = out + ch[i];
				i++;
			}
			res = res + " " + out + out.length();
		}
		System.out.println(res);
	}
}
