package com.tyss.designpattern.dao;

import java.io.File;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		// 1. load the conf file
		Configuration cfg = new Configuration();
		// cfg.configure();
		// cfg.configure("myHibernateConfigFile.xml");
		cfg.configure(new File("D:\\myHibernateConfigFile.xml"));
		// 2.build sessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		// 3.open session
		Session session = factory.openSession();

		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);

		session.close();

		return bean;
	}

}
