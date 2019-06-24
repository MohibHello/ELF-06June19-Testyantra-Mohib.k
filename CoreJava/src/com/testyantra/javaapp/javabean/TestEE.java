package com.testyantra.javaapp.javabean;
import lombok.extern.java.Log;

@Log
public class TestEE {

	public static void main(String[] args) {

		Employee1 e1 = new Employee1(true, "mahesh", 2303);

		log.info("Employee Name :- " + e1.getName());
		log.info("employee Id :-" + e1.getId());
		log.info("employee Status (true=working/false=not working) :- " + e1.isStatus());
	}
}
