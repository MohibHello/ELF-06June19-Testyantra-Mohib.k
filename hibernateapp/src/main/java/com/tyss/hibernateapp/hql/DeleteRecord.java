package com.tyss.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class DeleteRecord {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		String hql = "delete from EmployeeInfoBean where id=:eid";
		Query query = session.createQuery(hql);
		query.setParameter("eid", 115);
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Deleted --> " + result);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			session.close();
		}
	}
}
