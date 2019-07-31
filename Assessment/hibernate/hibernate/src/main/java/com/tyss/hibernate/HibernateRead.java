package com.tyss.hibernate;

import org.hibernate.Session;

import com.tyss.hibernate.dto.CustomerBean;
import com.tyss.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateRead {

	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();

		CustomerBean bean = session.get(CustomerBean.class, 1);

		log.info("customer detail " + bean.toString());
	}
}
