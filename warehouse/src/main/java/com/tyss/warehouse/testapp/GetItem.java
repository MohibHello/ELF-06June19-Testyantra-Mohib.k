package com.tyss.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.warehouse.bean.ItemBean;

import lombok.extern.java.Log;

@Log
public class GetItem {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		ItemBean itemBean = session.get(ItemBean.class, 102);

		log.info("ID : " + itemBean.getCost());
		log.info("Name :" + itemBean.getItemName());
		log.info("description : " + itemBean.getDescription());
		log.info("cost : " + itemBean.getCost());
		log.info("quantity : " + itemBean.getQuantity());

		session.close();

	}
}
