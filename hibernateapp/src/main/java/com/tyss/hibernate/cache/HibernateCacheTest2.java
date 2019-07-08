package com.tyss.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {

	public static void main(String[] args) {

		log.info("1st Time" + getEmployeeData(101).toString());
		log.info("2nd Time" + getEmployeeData(101).toString());
		log.info("3rd Time" + getEmployeeData(101).toString());
	}// End of main

	private static NewEmployeeInfoBean getEmployeeData(int id) {
		Configuration config = new Configuration();
		config.configure("com/tyss/hibernate/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		NewEmployeeInfoBean bean = session.get(NewEmployeeInfoBean.class, 101);

		session.close();

		return bean;
	}

}// End of Class
