package com.tyss.emp;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.emp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;

@Log
public class DeleteRecord {

	public static void main(String[] args) throws ParseException {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeOtherInfoBean empinf = session.get(EmployeeOtherInfoBean.class, 115);

		empinf.getId();

		Transaction transaction = session.beginTransaction();
		session.delete(empinf);
		transaction.commit();
		session.close();
	}
}
