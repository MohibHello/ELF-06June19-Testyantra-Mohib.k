package com.testyantra.javaapp.javabean;
import lombok.extern.java.Log;

@Log
public class EDB1 {

	void receive(Employee e) {
		log.info("Name of Employee : " + e.getName());
		log.info("Gender : " + e.getGender());
		log.info("Salary of employee : " + e.getSalary());
	}
}
