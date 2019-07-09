package com.tyss.hibernateapp.aws;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateProgramForAWS {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("com/tyss/hibernateapp/aws/hibernate.aws.cfg.xml");
		config.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		EmployeeInfoBean bean1 = session.get(EmployeeInfoBean.class, 101);
		log.info("1st time" + bean1.toString());

		session.close();

	}
}
