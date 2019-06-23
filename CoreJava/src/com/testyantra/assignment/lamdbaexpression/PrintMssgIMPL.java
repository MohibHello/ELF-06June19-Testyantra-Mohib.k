package com.testyantra.assignment.lamdbaexpression;

import lombok.extern.java.Log;

@Log
public class PrintMssgIMPL {

	public static void main(String[] args) {

		PrintMssg pm = () -> log.info("Hello Functional Interface ");

		pm.msg();
	}
}
