package com.testyantra.javaapp.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestE {

	public static void main(String[] args) {

		DemoExecutor d1 = new DemoExecutor("1st");
		DemoExecutor d2 = new DemoExecutor("2nd");
		DemoExecutor d3 = new DemoExecutor("3rd");
		DemoExecutor d4 = new DemoExecutor("4th");
		DemoExecutor d5 = new DemoExecutor("5th");

		ExecutorService ser = Executors.newFixedThreadPool(2);
		ser.execute(d1);
		ser.execute(d2);
		ser.execute(d3);
		ser.execute(d4);
		ser.execute(d5);

		ser.shutdown();
	}
}
