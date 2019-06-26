package com.testyantra.assignment.strings;

import lombok.extern.java.Log;

@Log
public class CustomStringReverse3 {
	public static void main(String[] args) {

		String s = "Hoga beda hudugi nana bittu";

		strcount(s);
	}

	public static void strcount(String s1) {
		char[] ch = s1.toCharArray();
		String res = "";
		for (int i = 0; i < ch.length; i++) {
			String out = "";
			while (ch[i] == ' ') {
				while (i < ch.length && ch[i] != ' ') {
					out = ch[i] + out;
					i++;
				}
				res = res + " " + out;
			}
		}
		log.info("" + res);
	}

	public static void instr(String s1) {

		String[] str = s1.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {

			log.info(str[i] + " ");
		}

	}
}
