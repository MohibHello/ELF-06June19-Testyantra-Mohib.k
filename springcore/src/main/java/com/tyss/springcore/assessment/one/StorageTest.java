package com.tyss.springcore.assessment.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StorageTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StorageConfig.class);
		User sdDevice = context.getBean(User.class);

		sdDevice.doSomthing();
	}
}
