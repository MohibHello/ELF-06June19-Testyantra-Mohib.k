package com.testyantra.javaapp.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class StreamOfArray {

	public static void main(String[] args) {

		Integer[] a = { 1, 4, 3, 55, 7, 6, 54 };

		Stream<Integer> s = Stream.of(a);

		s.forEach(i -> log.info("" + i));

		Stream<Integer> s2 = Stream.of(1, 4, 3, 55, 7, 6, 54);
		s2.forEach(i -> log.info("" + i));

		Stream s3 = Stream.of(a);
		s3.forEach(System.out::println);

	}
}
