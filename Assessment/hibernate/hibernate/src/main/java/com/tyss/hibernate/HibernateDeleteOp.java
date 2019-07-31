package com.tyss.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hibernate.dto.CustomerBean;
import com.tyss.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateDeleteOp {

	public static void main(String[] args) {
		
		
		Session session=null;
		Transaction transaction = null;
		
		try {
			session = HibernateUtil.openSession();
			transaction = session.beginTransaction();
			CustomerBean customerBean=session.get(CustomerBean.class, 1);
			customerBean.setAddress("hyderbad");
			session.delete(customerBean);
			transaction.commit();
			log.info("delete sucessfully");
			
			
			
		} catch (Exception e) {
			if(transaction!=null) {
			transaction.rollback();
			e.printStackTrace();
			}
		}
		finally {
			if(session!=null) {
			session.close();
			}
		}
	}
}
