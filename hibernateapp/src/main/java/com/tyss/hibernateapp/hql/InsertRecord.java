package com.tyss.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class InsertRecord {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		String hql = "insert into EmployeeTest(id,name,email) select id,name,email from EmployeeInfoBean where id=113";

		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			int result = query.executeUpdate();

			log.info("inserted into table -- " + result);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			session.close();
		}

	}
}