package com.tyss.sample;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) {

		MyimmutableClass class1 = new MyimmutableClass("hello", 23, 5858875747774L);
		log.info("name " + class1.getName());
		log.info("age " + class1.getAge());
		log.info("phone " + class1.getPhone());

	}
}
