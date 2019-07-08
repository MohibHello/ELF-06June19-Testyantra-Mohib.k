package com.tyss.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("com/tyss/hibernate/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		NewEmployeeInfoBean bean1 = session.get(NewEmployeeInfoBean.class, 101);
		log.info("1st " + bean1.toString());

		NewEmployeeInfoBean bean2 = session.get(NewEmployeeInfoBean.class, 101);
		log.info(" 2nd " + bean2.toString());

		NewEmployeeInfoBean bean3 = session.get(NewEmployeeInfoBean.class, 101);
		log.info(" 3rd " + bean3.toString());

		session.close();

	}// End of main
}// End of Class
