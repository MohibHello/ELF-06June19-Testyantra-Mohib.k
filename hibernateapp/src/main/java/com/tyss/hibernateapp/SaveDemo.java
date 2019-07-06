package com.tyss.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;
import com.tyss.hibernateapp.util.HibernateUtil;

public class SaveDemo {

	public static void main(String[] args) throws ParseException {

		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean empinf = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date joiningDate = format.parse("2002-04-23");
		Date dobDate = format.parse("1993-04-12");
		empinf.setId(119);
		empinf.setName("JAMES");
		empinf.setAge(35);
		empinf.setAccountNumber(656435433);
		empinf.setDepartmentId(2);
		empinf.setDesignation(" IT ANALYST");
		empinf.setDob(dobDate);
		empinf.setJoiningDate(joiningDate);
		empinf.setEmail("james111@gmail.com");
		empinf.setGender("male");
		empinf.setManagerId(102);
		empinf.setSalary(25000);
		empinf.setPhone(855664);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(empinf);
		// session.save(empinf); // passing or save the objects of empinf
		transaction.commit(); // commit operation
		session.close(); // costly resource

	}
}
