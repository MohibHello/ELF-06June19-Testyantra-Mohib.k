package com.tyss.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hibernate.dto.CustomerBean;
import com.tyss.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateCreateOp {

	public static void main(String[] args) {
		
		CustomerBean customerBean=new CustomerBean();
		
		customerBean.setId(1);
		customerBean.setAddress("mysore");
		customerBean.setCity("mysore");
		customerBean.setContactNumber(9900876645L);
		customerBean.setCountry("india");
		customerBean.setFirstName("mohib");
		customerBean.setLastName("khan");
		customerBean.setState("karnataka");
		
		Session session = null;
		Transaction transaction = null;
		
		try {
			session = HibernateUtil.openSession();
			transaction = session.beginTransaction();
			session.save(customerBean);
			transaction.commit();
			log.info("inserted sucessfully");
			
			
			
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
