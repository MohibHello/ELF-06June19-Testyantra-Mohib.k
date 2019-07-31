package com.tyss.hibernate.cache;

import org.hibernate.Session;

import com.tyss.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {

	public static void main(String[] args) {

		log.info("1st Time" + getEmployeeData(101).toString());
		log.info("2nd Time" + getEmployeeData(101).toString());
		log.info("3rd Time" + getEmployeeData(101).toString());
	}// End of main

	private static NewEmployeeInfoBean getEmployeeData(int id) {

		NewEmployeeInfoBean bean;

		try (Session session = HibernateUtil.openSession();) {

			bean = session.get(NewEmployeeInfoBean.class, id);
		}
		return bean;
	}

}// End of Class
