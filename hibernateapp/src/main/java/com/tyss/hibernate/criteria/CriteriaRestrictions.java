package com.tyss.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;
import com.tyss.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CriteriaRestrictions {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Criterion cr = Restrictions.gt("salary", Integer.parseInt("20000"));
		Criterion cr2 = Restrictions.le("salary", Integer.parseInt("50000"));
		criteria.add(cr2);
		criteria.add(cr);
		// EmployeeInfoBean emp = (EmployeeInfoBean) criteria.list();

		List<EmployeeInfoBean> emp = criteria.list();

		for (EmployeeInfoBean employeeInfoBean : emp) {
			log.info("" + employeeInfoBean);
		}

	}
}
