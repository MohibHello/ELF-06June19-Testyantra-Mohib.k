package com.testyantra.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class FilterTest {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(24);
		al.add(23);
		al.add(30);

		long x = al.stream().filter(i -> i % 3 == 0).count();

		log.info("" + x);

		List<Integer> x2 = al.stream().map(i -> i * 2).collect(Collectors.toList());

		log.info("" + x2);
	}
}
