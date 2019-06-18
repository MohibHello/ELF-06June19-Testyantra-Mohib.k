package com.testyantra.java.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingP2 {
	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("File1.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("File2.txt", true);
			String s;

			while ((s = br.readLine()) != null) {
				fw.write(s);
				fw.flush();
			}
			br.close();
			fw.close();
			System.out.println("file content2 copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
