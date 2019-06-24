package com.testyantra.javaapp.javabean;
import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {

		Boy b = new Boy("rohit", 34);
		log.info(""+b.getAge());
		log.info(""+b.getName());
	}
}