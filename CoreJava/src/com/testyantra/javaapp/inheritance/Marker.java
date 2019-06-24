package com.testyantra.javaapp.inheritance;
import lombok.extern.java.Log;

@Log
public class Marker extends Pen{

	void color()
	{
		log.info("coloring");
	}
	void write()
	{
		log.info("writing using Marker");
	}
}
