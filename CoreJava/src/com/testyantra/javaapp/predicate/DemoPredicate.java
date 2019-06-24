package com.testyantra.javaapp.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class DemoPredicate {

	public static void main(String[] args) {

		Predicate<Integer> p = a -> a % 2 == 0;

		boolean res = p.test(20);

		log.info("msg :- " + res);
	}
}
