package com.testyantra.assignment.lamdbaexpression;

import lombok.extern.java.Log;

@Log
public class PrintNumbersIMPL {

	public static void main(String[] args) {

		PrintNumbers pn = a -> {

			for (int i = 1; i <= a; i++) {
				log.info("numbers :- " + i);
			}
		};
		pn.print(10);
	}
}
