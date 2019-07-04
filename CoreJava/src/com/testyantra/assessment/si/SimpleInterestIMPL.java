package com.tyss.assessment.si;

import lombok.extern.java.Log;

@Log
public class SimpleInterestIMPL {

	public static void main(String[] args) {

		SimpleInterest si = (i, j, k) -> i * j * k / 100;

		double result = si.calulateSI(5000, 1.5, 3.3);

		log.info("" + result);

	}
}
