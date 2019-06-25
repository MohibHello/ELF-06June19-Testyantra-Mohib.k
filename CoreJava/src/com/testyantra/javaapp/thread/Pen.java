package com.testyantra.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	@Override
	public void run() {

		String s = getName();
		log.info("Name :-" + s);

		for (int i = 1; i <= 5; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				log.warning("exception handled" + e);
			}
			log.info("printing numbers " + i);
		}

	}
}
