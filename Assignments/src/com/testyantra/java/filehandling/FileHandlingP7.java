package com.testyantra.java.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingP7 {
	public static void main(String[] args) {

		try {
			FileReader fr1 = new FileReader("File1.txt");
			FileReader fr2 = new FileReader("File2.txt");

			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);

			FileWriter fw = new FileWriter("File3.txt", true);
			String s;

			while ((s = br1.readLine()) != null) {
				fw.write(s);
				fw.flush();
			}
			while ((s = br2.readLine()) != null) {
				fw.write(s);
				fw.flush();
			}

			br1.close();
			br2.close();
			fw.close();
			System.out.println("file content copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
