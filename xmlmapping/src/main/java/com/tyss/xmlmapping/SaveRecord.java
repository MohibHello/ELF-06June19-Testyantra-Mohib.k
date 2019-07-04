package com.tyss.xmlmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.DepartmentInfoBean;

public class SaveRecord {

	public static void main(String[] args) {

		DepartmentInfoBean empinf = new DepartmentInfoBean();
		empinf.setDepartmentName("IT");
		empinf.setDeptId(6);
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();

		session.saveOrUpdate(empinf);
		trans.commit();
		session.close();

	}

}
