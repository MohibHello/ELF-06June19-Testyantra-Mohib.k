package com.testyantra.javaapp.collection.set;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TreeSetStudent {

	public static void main(String[] args) {

		TreeSet<Student> tr = new TreeSet<Student>();
		Student s1 = new Student();
		s1.id = 101;
		s1.name = "hello";
		s1.percentage = 45.5;

		Student s2 = new Student();
		s2.id = 102;
		s2.name = "ello";
		s2.percentage = 65.5;

		Student s3 = new Student();
		s3.id = 103;
		s3.name = "llo";
		s3.percentage = 75.5;

		tr.add(s1);
		tr.add(s2);
		tr.add(s3);

		for (Student student : tr) {

			log.info("" + student.id);
			log.info("" + student.name);
			log.info("" + student.percentage);
		}
	}
}
