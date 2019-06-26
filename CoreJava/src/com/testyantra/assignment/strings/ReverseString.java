package com.testyantra.assignment.strings;

import lombok.extern.java.Log;

@Log
public class ReverseString {
	public static void main(String[] args) {

		String s = "hello";
		String s2 = reverse(s);
		log.info(s2);

	}

	public static String reverse(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {

			char temp = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = temp;
		}
		return new String(ch);
	}
}
