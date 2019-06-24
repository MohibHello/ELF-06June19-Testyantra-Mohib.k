package com.testyantra.javaapp.javabean;
import lombok.extern.java.Log;

@Log
public class DB1 {

	void receive(Person p) {
		log.info("***this is Db1***");
		log.info(p.getAge());
		log.info(p.getName());
	}
}
