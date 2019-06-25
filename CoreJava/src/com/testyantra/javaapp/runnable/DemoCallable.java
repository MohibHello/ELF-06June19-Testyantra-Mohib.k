package com.testyantra.javaapp.runnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class DemoCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Pencil p = new Pencil();

		FutureTask<Integer> fr = new FutureTask<>(p);

		Thread t = new Thread();
		t.start();

		int i = fr.get();

		log.info("" + i);
	}
}
