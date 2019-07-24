package com.tyss.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.warehouse.bean.ItemBean;

public class AddItem {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Session session = context.getBean("hibernateUtil", HibernateUtil.class).getSession();

		ItemBean itemBean = new ItemBean();
		itemBean.setItemId(101);
		itemBean.setItemName("samsung");
		itemBean.setCost(1200);
		itemBean.setDescription("galaxy Note 9");
		itemBean.setQuantity(60000);

		Transaction trans = null;

		try {
			trans = session.beginTransaction();
			session.saveOrUpdate(itemBean);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}

	}
}
