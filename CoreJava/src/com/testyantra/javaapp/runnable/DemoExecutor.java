package com.testyantra.javaapp.runnable;

import lombok.extern.java.Log;

@Log
public class DemoExecutor implements Runnable {

	String name;

	public DemoExecutor(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		log.info(name + " thread started");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			log.info(name + "===" + i);
		}
		log.info(name + " thread ended");
	}

}
