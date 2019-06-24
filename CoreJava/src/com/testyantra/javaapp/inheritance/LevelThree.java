package com.testyantra.javaapp.inheritance;
import lombok.extern.java.Log;

@Log
public class LevelThree extends LevelTwo {

	void run()
	{
		log.info("running");
	}
	void speed()
	{
		log.info("car speed 150-200kmph");
	}
}
