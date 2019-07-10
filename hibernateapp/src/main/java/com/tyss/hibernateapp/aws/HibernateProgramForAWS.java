package com.tyss.hibernateapp.aws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class HibernateProgramForAWS {

	public static void main(String[] args) throws ParseException {

		Configuration config = new Configuration();
		config.configure("com/tyss/hibernateapp/aws/hibernate.aws.cfg.xml");
		config.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = config.buildSessionFactory();

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
		session.save(empinf); // passing or save the objects of empinf
		transaction.commit(); // commit operation
		session.close(); // costly resource

		session.close();

	}
}
