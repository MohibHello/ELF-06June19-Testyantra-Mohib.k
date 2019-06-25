package com.testyantra.javaapp.functioni;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class FunSquare {

	public static void main(String[] args) {

		Function<Integer, Integer> f = s -> s * s;

		int res = f.apply(4);
		log.info("msg " + res);
	}
}
