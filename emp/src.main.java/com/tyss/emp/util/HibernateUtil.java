package com.tyss.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}

	public static SessionFactory buildSessionFactory() {
		return new Configuration().configure().addAnnotatedClass(EmployeeInfoBean.class)
				.addAnnotatedClass(EmployeeOtherInfoBean.class).buildSessionFactory();
	}

	public static Session openSession() {
		return getSessionFactory().openSession();
	}

}
