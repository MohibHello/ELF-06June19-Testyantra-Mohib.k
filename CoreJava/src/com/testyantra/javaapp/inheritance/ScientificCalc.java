package com.testyantra.javaapp.inheritance;
import lombok.extern.java.Log;

@Log
public class ScientificCalc extends Calculator {

	void sin()
	{
		log.info("sin() method");
	}
	void cos()
	{
		log.info("cos() method");
	}
	
}
