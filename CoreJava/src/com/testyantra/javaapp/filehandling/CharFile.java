package com.testyantra.javaapp.filehandling;


import java.io.FileWriter;
import java.io.IOException;

public class CharFile {
	public static void main(String[] args) {

		String msg = "dinka chika";
		char[] c = msg.toCharArray();

		FileWriter fr;
		try {
			fr = new FileWriter("song.txt");
			fr.write(c);
			fr.flush();
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
