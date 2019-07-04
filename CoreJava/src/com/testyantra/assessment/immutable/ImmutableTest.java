package com.tyss.assessment.immutable;

import lombok.extern.java.Log;

@Log
public class ImmutableTest {

	public static void main(String[] args) {

		ImmutableClassCreation imc = new ImmutableClassCreation(23, "mohib");
		log.info("" + imc.getAge());
		log.info("" + imc.getName());
	}
}
