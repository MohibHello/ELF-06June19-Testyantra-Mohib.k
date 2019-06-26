package com.testyantra.assignment.genericnumbers;

import lombok.extern.java.Log;

@Log
public class NumberFromFiftyToSixty {
	static void printNos(int n) {
		if (n <= 60) {
			log.info("" + n);
			printNos(n + 1);

		}
	}

	public static void main(String[] args) {
		printNos(50);
	}
}
