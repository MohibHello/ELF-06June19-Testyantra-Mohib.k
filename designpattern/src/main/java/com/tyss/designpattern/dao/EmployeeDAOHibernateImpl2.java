package com.tyss.designpattern.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.beans.EmployeeInfoBean;
import com.tyss.designpattern.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();

		return employeeInfoBeans;

	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {

		Session session = HibernateUtil.openSession();

		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);

		session.close();

		return bean;
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		try {
			EmployeeInfoBean bean = new EmployeeInfoBean();
			bean.setId(id);
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return false;
	}

}
