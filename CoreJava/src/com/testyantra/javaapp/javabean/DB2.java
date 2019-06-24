package com.testyantra.javaapp.javabean;
import lombok.extern.java.Log;

@Log
public class DB2 {

	void receive(Person p) {
		log.info("*** this DB2***");
		log.info(p.getAge());
		log.info(p.getName());
	}
}
