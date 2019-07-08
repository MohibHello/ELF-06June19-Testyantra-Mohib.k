package com.tyss.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		/*
		 * // query to fetch all the data from bean class String hql =
		 * "from EmployeeInfoBean";
		 * 
		 * Query query = session.createQuery(hql); List<EmployeeInfoBean>
		 * employeeInfoBeans = query.list();
		 * 
		 * for (EmployeeInfoBean employeeInfoBean : employeeInfoBeans) { log.info("" +
		 * employeeInfoBean.toString()); }
		 */

		String hql = "select name from EmployeeInfoBean";

		Query query = session.createQuery(hql);
		List<String> ename = query.list();

		for (String empName : ename) {
			log.info("Name :" + empName);
		}

	}
}
