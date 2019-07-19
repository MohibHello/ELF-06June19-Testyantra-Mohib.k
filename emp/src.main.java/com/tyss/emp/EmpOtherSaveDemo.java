package com.tyss.emp;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.emp.dto.EmployeeOtherInfoBean;

public class EmpOtherSaveDemo {

	public static void main(String[] args) throws ParseException {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeOtherInfoBean empOtherInf = new EmployeeOtherInfoBean();
		empOtherInf.setId(115);
		empOtherInf.setAdhar(564563437);
		empOtherInf.setBloodGroup("A+");
		empOtherInf.setEmergencyContactNumber(36343636);
		empOtherInf.setEmergencyContactPerson("rajesh");
		empOtherInf.setFatherName("rockstar");
		empOtherInf.setMotherName("kantabai");
		empOtherInf.setMarried(true);
		empOtherInf.setIschallenged(false);
		empOtherInf.setNationality("indian");
		empOtherInf.setPassport("qwrqwr23");
		empOtherInf.setReligion("christ");
		empOtherInf.setSpouseName("sombody");

		Transaction transaction = session.beginTransaction();
		session.save(empOtherInf); // passing or save the objects of empinf
		transaction.commit(); // commit operation
		session.close(); // costly resource

	}
}
