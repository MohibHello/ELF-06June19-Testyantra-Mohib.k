package com.testyantra.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ArrayListDem {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(45);
		al.add(12);
		al.add(56);
		al.add(67);

		Comparator<Integer> c = (a, b) -> a.compareTo(b);

		Integer minValue = al.stream().min(c).get();
		log.info("" + minValue);

		Integer maxValue = al.stream().max(c).get();
		log.info("" + maxValue);

		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		for (Integer i : l) {
			log.info("" + i);
		}

		al.stream().forEach(i -> log.info("" + i));
	}
}
