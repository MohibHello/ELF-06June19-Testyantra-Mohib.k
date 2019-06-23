package com.testyantra.assignment.lamdbaexpression;

import lombok.extern.java.Log;

@Log
public class AddTwoNumbersIMPL {

	public static void main(String[] args) {

		AddTwoNumbers ad = (a, b) -> a + b;

		int res = ad.add(5, 12);
		log.info("Result : " + res);
	}

}
