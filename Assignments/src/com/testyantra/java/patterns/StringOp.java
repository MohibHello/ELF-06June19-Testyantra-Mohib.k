package com.testyantra.java.patterns;

public class StringOp {
	public static String reverseWord(String s1) {
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
		return res;
		
	}

	public static void main(String[] args) {
		String s1 = new String("hello its java");
		String s = reverseWord(s1);

		System.out.println(s);

	}
}
