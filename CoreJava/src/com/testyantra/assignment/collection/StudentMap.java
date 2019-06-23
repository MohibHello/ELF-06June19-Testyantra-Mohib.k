package com.testyantra.assignment.collection;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class StudentMap {

	public static void main(String[] args) {

		StudentsAL s1 = new StudentsAL(1, "mohib", 51, 'm');
		StudentsAL s2 = new StudentsAL(12, "ranjita", 50, 'f');
		StudentsAL s3 = new StudentsAL(8, "rohit", 84, 'm');
		StudentsAL s4 = new StudentsAL(9, "mohini", 96, 'f');
		StudentsAL s5 = new StudentsAL(6, "riya", 24, 'f');
		StudentsAL s6 = new StudentsAL(5, "jazz", 59, 'f');
		StudentsAL s7 = new StudentsAL(4, "ash", 35, 'm');
		StudentsAL s8 = new StudentsAL(2, "morgan", 45, 'm');
		StudentsAL s9 = new StudentsAL(3, "salman", 65, 'm');

		ArrayList<StudentsAL> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		al.add(s9);

		TreeMap<Integer, ArrayList<StudentsAL>> tm = new TreeMap<>();

		tm.put(4, al);
		tm.put(3, al);
		tm.put(2, al);
		tm.put(5, al);

		for (Map.Entry<Integer, ArrayList<StudentsAL>> e : tm.entrySet()) {

			Integer i = e.getKey();
			ArrayList<StudentsAL> als = e.getValue();

			System.out.println("Key : " + i);
			System.out.println("Value : " + als);
		}

	}
}
