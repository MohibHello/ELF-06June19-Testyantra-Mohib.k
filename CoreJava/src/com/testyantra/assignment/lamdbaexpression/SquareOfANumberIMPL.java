package com.testyantra.assignment.lamdbaexpression;

import lombok.extern.java.Log;

@Log
public class SquareOfANumberIMPL {

	public static void main(String[] args) {

		SquareOfANumbers sq = a -> a * a;
		int res = sq.square(6);
		log.info("result :- " + res);
	}
}
