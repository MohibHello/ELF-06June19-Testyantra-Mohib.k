package com.testyantra.javaapp.consumer;

import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class DemoConsumerStudent {

	public static void main(String[] args) {

		Consumer<Student> c = s -> {
			double a = (s.marks1 + s.marks2 + s.marks3) / 3.0;
			log.info(s.name + " Scored " + a);
		};
		Student s1 = new Student("he", 100, 23, 56);

		c.accept(s1);
	}
}
