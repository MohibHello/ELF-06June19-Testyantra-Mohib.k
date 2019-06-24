package com.testyantra.javaapp.wrapper;
import lombok.extern.java.Log;

@Log
public class Parsing {

	public static void main(String[] args) {

		String s1 = "12";
		String s2 = "12";

		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);

		log.info(""+(i + j));
	}
}
