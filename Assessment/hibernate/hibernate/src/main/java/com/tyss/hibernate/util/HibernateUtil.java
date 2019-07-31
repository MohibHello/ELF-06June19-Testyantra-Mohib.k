package com.tyss.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernate.cache.NewEmployeeInfoBean;
import com.tyss.hibernate.dto.CustomerBean;
import com.tyss.hibernate.dto.SampleBean;
import com.tyss.hibernate.dto.StudentBean;
import com.tyss.hibernate.dto.Student_InfoBean;
import com.tyss.hibernate.dto.Student_OtherInfoBean;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}

	private static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			sessionFactory = HibernateUtil.buildSessionFactory();
		}
		return sessionFactory;
	}

	private static SessionFactory buildSessionFactory() {

		SessionFactory factory = new Configuration().configure()
				.addAnnotatedClass(CustomerBean.class)
				.addAnnotatedClass(SampleBean.class)
				.addAnnotatedClass(StudentBean.class)
				.addAnnotatedClass(Student_InfoBean.class)
				.addAnnotatedClass(Student_OtherInfoBean.class)
				.addAnnotatedClass(NewEmployeeInfoBean.class)
				.buildSessionFactory();
		return factory;
	}

	public static Session openSession() {

		return HibernateUtil.getSessionFactory().openSession();
	}
}
