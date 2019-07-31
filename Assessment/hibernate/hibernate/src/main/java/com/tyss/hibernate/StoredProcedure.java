package com.tyss.hibernate;


import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StoredProcedure {

	public static void main(String[] args) {


		Session session = HibernateUtil.openSession();

		StoredProcedureQuery query = session.createStoredProcedureCall("student");

		List<Object[]> result = query.getResultList();

		for (Object[] objects : result) {
			log.info("" + objects[0]);
			log.info("" + objects[1]);
			log.info("" + objects[2]);
			log.info("" + objects[3]);
			
		}

	}
}
