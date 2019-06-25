package com.testyantra.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class Averageimpl {

	public static void main(String[] args) {

		MyStudent a = new MyStudent();
		Average av = a::avg;

		double d = av.avg(13, 45, 56);

		log.info("avg" + d);
	}
}
