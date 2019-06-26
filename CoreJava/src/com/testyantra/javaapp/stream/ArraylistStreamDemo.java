package com.testyantra.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ArraylistStreamDemo {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(4);

		List<Integer> x = al.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		log.info("" + x);
	}
}
