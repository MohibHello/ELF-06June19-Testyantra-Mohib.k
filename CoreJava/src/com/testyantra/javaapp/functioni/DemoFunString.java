package com.testyantra.javaapp.functioni;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class DemoFunString {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();

		int res = f.apply("hello");

		log.info("msg : " + res);
	}
}
