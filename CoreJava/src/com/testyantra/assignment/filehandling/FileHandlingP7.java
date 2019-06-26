package com.testyantra.assignment.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class FileHandlingP7 {
	public static void main(String[] args) {

		FileReader fr = null;
		FileReader fr2 = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("File1.txt");
			fr2 = new FileReader("File2.txt");
			fw = new FileWriter("File3.txt", true);
			int ch = fr.read();
			int ch2 = fr2.read();

			while (ch != -1) {
				fw.write(ch);
				ch = fr.read();
			}
			while (ch2 != -1) {
				fw.write(ch2);
				ch2 = fr2.read();
			}

			log.info("file content copied and appended to file 3");
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
