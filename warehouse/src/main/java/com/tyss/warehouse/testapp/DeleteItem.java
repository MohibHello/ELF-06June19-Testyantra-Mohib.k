package com.tyss.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.warehouse.bean.ItemBean;

public class DeleteItem {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		ItemBean itemBean = session.get(ItemBean.class, 101);

		Transaction trans = session.beginTransaction();
		session.delete(itemBean);
		trans.commit();

		session.close();
	}
}
