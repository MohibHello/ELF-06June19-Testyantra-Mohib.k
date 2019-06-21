package com.testyantra.javaapp.lombok;

import java.util.logging.Logger;

public class TestEBA {

	private static final Logger L = Logger.getLogger("bean");

	public static void main(String[] args) {

		EmployeeBean eb = new EmployeeBean();
		eb.setAge(12);
		eb.setDeptartment("ok");
		eb.setGender("male");
		eb.setId(123);
		eb.setName("mohib");
		eb.setJoining_date(null);
		L.info("with lambok-->" + eb.toString());

		EmployeeBean2 eb2 = new EmployeeBean2();
		L.info("without lambok-->" + eb2.toString());

	}
}
