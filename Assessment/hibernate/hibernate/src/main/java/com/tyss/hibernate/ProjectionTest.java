package com.tyss.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.tyss.hibernate.dto.StudentBean;
import com.tyss.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ProjectionTest{

		public static void main(String[] args) {

			Session session = HibernateUtil.openSession();

			Criteria criteria = session.createCriteria(StudentBean.class);
			Projection project = session.createCriteria(persistentClass);
		}
