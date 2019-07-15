package com.testyantra.mywebapp.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.testyantra.beans.EmployeeInfoBean;
import com.tyss.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		return null;
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		return null;
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();

		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);

		session.close();

		return bean;
	}

	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return false;
	}

	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return false;
	}

	public boolean deleteEmployeeInfo(int id) {
		return false;
	}

	public boolean deleteEmployeeInfo(String id) {
		return false;
	}

}
