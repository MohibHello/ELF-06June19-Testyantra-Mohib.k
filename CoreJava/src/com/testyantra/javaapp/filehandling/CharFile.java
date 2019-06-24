package com.testyantra.javaapp.filehandling;

import java.io.FileWriter;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class CharFile {
	public static void main(String[] args) {

		String msg = "dinka chika";
		char[] c = msg.toCharArray();

		FileWriter fr = null;
		try {
			fr = new FileWriter("song.txt");
			fr.write(c);
			fr.flush();
			log.info("done");
		} catch (IOException e) {
			log.warning("exception" + e);
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				log.warning("exception " + e);
			}
		}

	}
}
