package com.tyss.assessment.equalityobject;

import lombok.extern.java.Log;

@Log
public class EqualityComparation {

	public static void main(String[] args) {

		String string1 = new String("Hello");
		String string2 = new String("HEllo");
		String string3 = new String("HeLLo");

		boolean equal = string1.equalsIgnoreCase(string3);
		boolean equal2 = string2.equals(string1);

		log.info("Comparing string1 and string2 using equalsIgnoreCase -->" + equal);
		log.info("Comparing string1 and string2 -->" + equal2);
	}
}
