package com.testyantra.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class AddTwonumberIMPL {

	public static void main(String[] args) {

		AddTwoNum ad = MyStudent::sum;

		int i = ad.add(13, 14);

		log.info("sum is " + i);
	}
}
