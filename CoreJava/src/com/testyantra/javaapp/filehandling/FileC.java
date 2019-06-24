package com.testyantra.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class FileC {

	public static void main(String[] args) {

		File f = new File("m:/mohib.txt");

		try {
			boolean res = f.createNewFile();
			log.info("result : " + res);
			log.info("done");

		} catch (IOException e) {
			log.warning("ioexception" + e);
		}
	}
}
