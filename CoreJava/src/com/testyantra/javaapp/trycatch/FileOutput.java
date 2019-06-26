package com.testyantra.javaapp.trycatch;

import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class FileOutput {

	public static void main(String[] args) {

		String msg = "hello";
		byte[] b = msg.getBytes();
		try (FileOutputStream fout = new FileOutputStream("file.txt")) {

			fout.write(b);
			log.info("witten");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
