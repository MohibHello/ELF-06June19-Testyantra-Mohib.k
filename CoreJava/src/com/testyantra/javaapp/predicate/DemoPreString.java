package com.testyantra.javaapp.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class DemoPreString {

	public static void main(String[] args) {

		Predicate<String> p = a -> a.length() == 5;

		String str = "hello";

		boolean res = p.test(str);
		log.info("msg :- " + res);
	}
}
