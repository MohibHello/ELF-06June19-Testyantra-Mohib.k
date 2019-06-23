package com.testyantra.assignment.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
public class EmployeeMapTest {

	public static void main(String[] args) {

		EmployeeMap e1 = new EmployeeMap("Aaa", 401, "UI Developer", 45000);
		EmployeeMap e2 = new EmployeeMap("Caa", 302, "web Developer", 8000);
		EmployeeMap e3 = new EmployeeMap("Daa", 203, "sft Developer", 67000);
		EmployeeMap e4 = new EmployeeMap("Baa", 104, "robotic Developer", 55000);
		EmployeeMap e5 = new EmployeeMap("Eaa", 605, "Android Developer", 25000);
		EmployeeMap e6 = new EmployeeMap("Faa", 506, "java Developer", 25000);

		ArrayList<EmployeeMap> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);

		Map<Integer, ArrayList<EmployeeMap>> tm = new HashMap<>();
		tm.put(1, al);
		tm.put(3, al);
		tm.put(2, al);

		for (Map.Entry<Integer, ArrayList<EmployeeMap>> e : tm.entrySet()) {

			Integer i = e.getKey();
			ArrayList<EmployeeMap> als = e.getValue();

			log.info("Key : " + i);
			log.info("Value : " + als);
		}
	}
}
