package com.testyantra.assignment.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingP2 {
	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("File1.txt");
			fw = new FileWriter("File2.txt", true);
			int ch = fr.read();

			while (ch != -1) {
				fw.write(ch);
				ch = fr.read();
			}
			System.out.println("file content copied and appended");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
