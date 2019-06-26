package com.testyantra.javaapp.stream;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class FilterSortedDemo {
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

		al.stream().forEach(i -> log.info("" + i));
	}
}