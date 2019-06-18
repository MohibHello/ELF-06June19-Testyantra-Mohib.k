package com.testyantra.javaapp.filehandling;


import java.io.File;
import java.io.IOException;

public class FileC {

	public static void main(String[] args) {

		File f = new File("m:/mohib.txt");

		try {
			boolean res = f.createNewFile();
			System.out.println("result : " + res);
			System.out.println("done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
