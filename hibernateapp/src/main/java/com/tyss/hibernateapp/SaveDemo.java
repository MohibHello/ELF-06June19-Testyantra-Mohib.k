package com.tyss.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;

public class SaveDemo {

	public static void main(String[] args) throws ParseException {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean empinf = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date joiningDate = format.parse("2002-04-23");
		Date dobDate = format.parse("1993-04-12");
		empinf.setId(115);
		empinf.setName("james");
		empinf.setAge(25);
		empinf.setAccountNumber(656435433);
		empinf.setDeptNo(3);
		empinf.setDesignation(" it analyst");
		empinf.setDob(dobDate);
		empinf.setJoiningDate(joiningDate);
		empinf.setEmail("james@gmail.com");
		empinf.setGender("male");
		empinf.setMgrId(101);
		empinf.setSalary(22000);
		empinf.setPhone(778855664);

		Transaction transaction = session.beginTransaction();
		session.save(empinf); // passing or save the objects of empinf
		transaction.commit(); // commit operation
		session.close(); // costly resource

	}
}
