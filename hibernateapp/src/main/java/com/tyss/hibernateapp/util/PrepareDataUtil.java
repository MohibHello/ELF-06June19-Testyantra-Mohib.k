package com.tyss.hibernateapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tyss.hibernateapp.onetoone.EmployeeInfoBean;
import com.tyss.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class PrepareDataUtil {

	private PrepareDataUtil() {
	}

	public static EmployeeInfoBean prepareData(int id) throws ParseException {
		// Prepare Data
		EmployeeInfoBean empinf = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date joiningDate = format.parse("2002-04-23");
		Date dobDate = format.parse("1993-03-12");
		empinf.setId(id);
		empinf.setName("JAMES");
		empinf.setAge(65);
		empinf.setAccountNumber(3636336);
		empinf.setDepartmentId(3);
		empinf.setDesignation("ANALYST");
		empinf.setDob(dobDate);
		empinf.setJoiningDate(joiningDate);
		empinf.setEmail("james111@gmail.com");
		empinf.setGender("male");
		empinf.setManagerId(111);
		empinf.setSalary(88000);
		empinf.setPhone(5335535);

		EmployeeOtherInfoBean empOthInf = new EmployeeOtherInfoBean();
		empOthInf.setId(id);
		empOthInf.setAdhar(54532121);
		empOthInf.setBloodGroup("A+");
		empOthInf.setEmergencyContactNumber(911);
		empOthInf.setEmergencyContactPerson("suresh");
		empOthInf.setFatherName("ramesh");
		empOthInf.setIschallenged(false);
		empOthInf.setMarried(false);
		empOthInf.setMotherName("alex");
		empOthInf.setNationality("indian");
		empOthInf.setReligion("christian");
		empOthInf.setSpouseName("hello");

		empinf.setOtherInfo(empOthInf);

		return empinf;
	}
}
