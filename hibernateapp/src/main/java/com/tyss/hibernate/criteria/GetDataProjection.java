package com.tyss.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;
import com.tyss.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDataProjection {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection project = Projections.property("name");
		Projection project2 = Projections.property("id");
		Projection project3 = Projections.property("age");
		ProjectionList projectlist = Projections.projectionList();
		projectlist.add(project);
		projectlist.add(project2);
		projectlist.add(project3);
		criteria.setProjection(projectlist);

		List<Object[]> str = criteria.list();

		for (Object[] ob : str) {
			log.info("Name : " + ob[0]);
			log.info("ID : " + ob[1]);
			log.info("Age : " + ob[2]);
		}
	}
}
