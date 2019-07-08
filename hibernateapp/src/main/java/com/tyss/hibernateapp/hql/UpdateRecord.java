package com.tyss.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		String hql = "update from EmployeeInfoBean set name='" + args[0] + "' where id=" + args[1];
		Query query = session.createQuery(hql);
//		query.setParameter("ename", arg s[0]);
//		query.setParameter("eid", Integer.parseInt(args[1]));
		// query.setParameter("ename", "mohib Khan");
		// query.setParameter("eid", 113);
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Updated --> " + result);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			session.close();
		}
	}

}
