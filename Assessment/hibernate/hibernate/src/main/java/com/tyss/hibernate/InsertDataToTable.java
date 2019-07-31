package com.tyss.hibernate;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class InsertDataToTable {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.openSession();
		
		String hql="insert into SampleBean(id,firstName,lastName,city) select id,firstName,lastName,city from CustomerBean ";
		
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery(hql);
		int res= query.executeUpdate();
	log.info("inserted  ->"+res);	
	}
	
}
