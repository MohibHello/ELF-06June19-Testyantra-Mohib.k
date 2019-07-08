package com.tyss.hibernate.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StoredProcedure {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		StoredProcedureQuery query = session.createStoredProcedureCall("empinfo");

		List<Object[]> result = query.getResultList();

		for (Object[] objects : result) {
			log.info("" + objects[0]);
			log.info("" + objects[1]);
			log.info("" + objects[2]);
			log.info("" + objects[3]);
			log.info("" + objects[4]);
			log.info("" + objects[5]);
			log.info("" + objects[6]);
			log.info("" + objects[7]);
		}

	}
}
