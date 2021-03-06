package com.tyss.designpattern.dao;

import java.util.ArrayList;

import org.hibernate.Session;

import com.tyss.beans.EmployeeInfoBean;
import com.tyss.designpattern.util.HibernateUtil;

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
		// Configuration cfg = new Configuration();
		// cfg.configure();
		// cfg.configure("myHibernateConfigFile.xml");
		// cfg.configure(new File("D:\\myHibernateConfigFile.xml"));
		/*
		 * try { cfg.configure(new URL(
		 * "https://raw.githubusercontent.com/MohibHello/ELF-06June19-Testyantra-Mohib.k"
		 * + "/master/hibernateapp/myHibernateConfigFile.xml")); } catch
		 * (HibernateException | MalformedURLException e) { e.printStackTrace(); }
		 */
		// SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = HibernateUtil.openSession();

		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);

		session.close();

		return bean;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
