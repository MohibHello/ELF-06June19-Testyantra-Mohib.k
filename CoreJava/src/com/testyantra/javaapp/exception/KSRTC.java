package com.testyantra.javaapp.exception;

class KSRTC {

	void ticket() {

		System.out.println("ticket generating");

		/*
		 * File f = new File("hello.txt"); f.createNewFile();
		 */

		try {

			System.out.println("exception not occured" + (10 / 0));

			System.out.println("ticket generated sucessfully");
		} catch (ArithmeticException e) {
			System.out.println("exception occured");

		}

	}

}
