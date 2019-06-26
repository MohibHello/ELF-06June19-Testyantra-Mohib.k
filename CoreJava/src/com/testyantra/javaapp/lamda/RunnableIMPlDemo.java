package com.testyantra.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class RunnableIMPlDemo {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 1; i <= 5; i++) {
				log.info("" + i);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
