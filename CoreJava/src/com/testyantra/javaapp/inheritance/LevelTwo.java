package com.testyantra.javaapp.inheritance;
import lombok.extern.java.Log;

@Log
public class LevelTwo extends LevelOne {

	void walk()
	{
		log.info("walking");
	}
	void speed()
	{
		log.info("car speed 100-150kmph");
	}
}
