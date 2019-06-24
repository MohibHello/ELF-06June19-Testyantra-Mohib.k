package com.testyantra.javaapp.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

@Log
public class FileHandlingEx {

	public static void main(String[] args) {

		try {

			FileUtils.writeStringToFile(new File("hello mna.txt"), "this is a new method", Charset.defaultCharset());
			log.info("file is created");

			String fileread = FileUtils.readFileToString(new File("mohib.txt"));

			log.info("read :-" + fileread);
		} catch (IOException e) {
			log.warning("IOException" + e);
		}

	}
}
