package com.testyantra.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class BoyTest {

	public static void main(String[] args) {

		MyBoy b = Boy::new;

		Boy bb = b.getBoy("nouy", 4.4, 12);
		log.info("" + bb);
	}
}
