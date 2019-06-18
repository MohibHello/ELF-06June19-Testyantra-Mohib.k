package com.testyantra.javaapp.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class FileHandlingEx {

	public static void main(String[] args) {

		try {
			// FileUtils.writeStringToFile(new File("myfilecom.txt"), "this this apache
			// commons file.io");

			FileUtils.writeStringToFile(new File("hello mna.txt"), "this is a new method", Charset.defaultCharset());
			System.out.println("file is created");

			String fileread = FileUtils.readFileToString(new File("mohib.txt"));

			System.out.println("read :-" + fileread);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
