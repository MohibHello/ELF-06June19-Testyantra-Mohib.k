package com.tyss.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;
import com.tyss.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllDetail {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> emp = criteria.list();

		for (EmployeeInfoBean employeeInfoBean : emp) {
			log.info("Id : " + employeeInfoBean.getId());
			log.info("Name : " + employeeInfoBean.getName());
			log.info("salary : " + employeeInfoBean.getSalary());
			log.info("age : " + employeeInfoBean.getAge());
			log.info("Email " + employeeInfoBean.getEmail());
			log.info("department id : " + employeeInfoBean.getDepartmentId());
		}
	}
}
