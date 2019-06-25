package com.testyantra.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class PVR {

	synchronized void book() {
		log.info("book my show");
		for (int i = 0; i < 5; i++) {
			try {

				Thread.sleep(1000);
				log.info(Thread.currentThread() + "" + i);
				wait();
			} catch (InterruptedException e) {
				log.warning("Exception occured" + e);
			}
		}
	}

	synchronized void leave() {
		notifyAll();
	}
}
