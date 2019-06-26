package com.testyantra.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class FilterForeachDemo {
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

		Comparator<Integer> c = (i, j) -> i.compareTo(j) * -1;

		List<Integer> s = al.stream().sorted(c).collect(Collectors.toList());
		log.info("" + s);

	}
}