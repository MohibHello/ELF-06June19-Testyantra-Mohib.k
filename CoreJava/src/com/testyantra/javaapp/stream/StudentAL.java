package com.testyantra.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class StudentAL {

	static Comparator<Student> c = (a, b) -> {
		if (a.percent > b.percent) {
			return 1;
		} else if (a.percent < b.percent) {
			return -1;
		} else {
			return 0;
		}
	};

	static Student getTopper(ArrayList<Student> al) {

		return al.stream().max(c).get();
	}

	static Student getPapa(ArrayList<Student> al) {

		return al.stream().min(c).get();

	}

	public static void main(String[] args) {

		Student s1 = new Student(101, "mohit", 36.6);
		Student s2 = new Student(111, "rohit", 76.1);
		Student s3 = new Student(201, "harish", 66.7);
		Student s4 = new Student(221, "rakesh", 89.6);
		Student s5 = new Student(102, "anitha", 77.2);
		Student s6 = new Student(133, "akash", 67.5);

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);

		Student maxValue = al.stream().max(c).get();

		log.info("Topper is" + maxValue);

		Student s = getPapa(al);

		log.info("papa Guy : -" + s);

	}
}
