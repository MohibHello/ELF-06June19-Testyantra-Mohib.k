package com.tyss.assessment.singleton;

import lombok.extern.java.Log;

@Log
public class SingletonTest {

	public static void main(String[] args) {

		SingletonCreation singleton1 = SingletonCreation.getObject();
		SingletonCreation singleton2 = SingletonCreation.getObject();
		SingletonCreation singleton3 = SingletonCreation.getObject();
		SingletonCreation singleton4 = SingletonCreation.getObject();

		log.info("" + SingletonCreation.count);
	}
}
