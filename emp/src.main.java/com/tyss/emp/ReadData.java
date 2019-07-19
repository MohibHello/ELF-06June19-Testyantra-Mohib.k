package com.tyss.emp;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.emp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadData {
	public static void main(String[] args) throws ParseException {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeOtherInfoBean empinf = session.get(EmployeeOtherInfoBean.class, 115);
		log.info("" + empinf.getAdhar());
		log.info("" + empinf.getBloodGroup());

		log.info("" + empinf.getEmergencyContactNumber());
		log.info("" + empinf.getId());
		log.info("" + empinf.isMarried());
		session.close();
	}
}
