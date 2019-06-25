package com.testyantra.javaapp.functioni;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class DemoFunction {

	public static void main(String[] args) {

		Function<Double, Double> f = r -> 3.142 * r * r;
		double x = f.apply(5.4);
		log.info("msg :- " + x);
	}
}
