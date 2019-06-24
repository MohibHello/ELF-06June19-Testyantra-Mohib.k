package com.testyantra.javaapp.inheritance;
import lombok.extern.java.Log;

@Log
public class Cow extends Animal {

	void eating()
	{
		log.info("eating grass");
	}
}
