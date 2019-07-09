package com.tyss.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCacheUtil {

	private static SessionFactory sessionFactory;

	private HibernateCacheUtil() {
	}

	private static SessionFactory buildSessionFactory() {

		Configuration config = new Configuration();
		config.configure("com/tyss/hibernate/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);
		SessionFactory session = config.buildSessionFactory();
		return session;
	}

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}

	public static Session openSession() {
		return buildSessionFactory().openSession();
	}
}
