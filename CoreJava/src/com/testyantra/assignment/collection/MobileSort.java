package com.testyantra.assignment.collection;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class MobileSort {

	public static void main(String[] args) {

		Mobile m1 = new Mobile();
		m1.setBrand("samsung");
		m1.setPrice(10000.0);
		m1.setSerialId(1534);

		Mobile m2 = new Mobile();
		m2.setBrand("vivo");
		m2.setPrice(40000.0);
		m2.setSerialId(1434);

		Mobile m3 = new Mobile();
		m3.setBrand("Iphone");
		m3.setPrice(90000.0);
		m3.setSerialId(1349);

		Mobile m4 = new Mobile();
		m4.setBrand("OnePlus");
		m4.setPrice(56000.0);
		m4.setSerialId(1124);

		TreeSet<Mobile> tr = new TreeSet<>();
		tr.add(m1);
		tr.add(m2);
		tr.add(m3);
		tr.add(m4);

		for (Mobile m : tr) {
			log.info("Serial ID :-" + m.getSerialId());
			log.info("Brand :-" + m.getBrand());
			log.info("Price" + m.getPrice());
		}

	}
}
