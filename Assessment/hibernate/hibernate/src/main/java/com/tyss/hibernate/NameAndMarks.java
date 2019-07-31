package com.tyss.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.tyss.hibernate.dto.CustomerBean;
import com.tyss.hibernate.dto.StudentBean;
import com.tyss.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class NameAndMarks {

	public static void main(String[] args) {
		
		StudentBean bean=new StudentBean();
		
		Session session = HibernateUtil.openSession();

		String hql="select firstName,totalmarks from StudentBean";

		Query query=session.createQuery(hql);
		List<StudentBean> res= query.list();
	
		for (StudentBean studentBean : res) {
			log.info("customer detail " + studentBean.toString());
		}
		
		
		
	}
}
