package com.tyss.designpattern.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) throws ParseException {

		MyimmutableClass class1 = new MyimmutableClass("hello", 23, 5858875747774L);
		log.info("name " + class1.getName());
		log.info("age " + class1.getAge());
		log.info("phone " + class1.getPhone());

		SimpleDateFormat sm = new SimpleDateFormat("yyyy-mm-dd");
		Date date1 = sm.parse("2011-07-12");
		Date date2 = sm.parse("1988-03-23");

		EmployeeData empbean = new EmployeeData(111, "mohit", 23, "male", 23000, 453525, date1, 64367474,
				"mohit@gmail.com", "hr", date2, 1, 102);

		log.info("id " + empbean.getId());
		log.info(" Name " + empbean.getName());
		log.info("mgr id" + empbean.getManagerId());

//		log.info("" + empbean.toString());

		/*
		 * EmployeeData2 data2 = new
		 * EmployeeData2.EmployeeData2Builder().id(123).name("mohit").age(23)
		 * .accountNumber(123245).departmentId(5).designation("developer").dob(date1).
		 * email("hello@gmail.com")
		 * .gender("male").joiningDate(date1).managerId(1).phone(456456).salary(34444).
		 * build();
		 * 
		 * log.info("" + data2.toString());
		 */

		EmployeeData3 data3 = new EmployeeData3.EmployeeData3Builder().id(123).name("mohit").age(23)
				.accountNumber(123245).departmentId(5).designation("developer").dob(date1).email("hello@gmail.com")
				.gender("male").joiningDate(date1).managerId(1).phone(456456).salary(34444).build();

		log.info("" + data3.toString());

	}
}
