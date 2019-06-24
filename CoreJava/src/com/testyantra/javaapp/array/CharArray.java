package com.testyantra.javaapp.array;

import lombok.extern.java.Log;

@Log
public class CharArray {
	public static void main(String[] args) {

		char[] ch = new char[5];
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		ch[3] = 'd';
		ch[4] = 'e';

		for (int i = 0; i < ch.length; i++) {
			log.info("element no." + i + " " + ch[i]);
		}
		log.info("" + ch.length);
	}
}
