package com.tyss.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hibernate.dto.Student_InfoBean;
import com.tyss.hibernate.dto.Student_OtherInfoBean;
import com.tyss.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class OneToOneTest {

	public static void main(String[] args) {

		Student_InfoBean bean = new Student_InfoBean();
		bean.setAge(11);
		bean.setEmailId("wwww@gamil.com");
		bean.setGender("male");
		bean.setMobileNo(1234);
		bean.setName("hello");
		bean.setRollNum(18);

		Student_OtherInfoBean otherInfoBean = new Student_OtherInfoBean();
		otherInfoBean.setFatherName("abc");
		otherInfoBean.setMotherName("xyz");
		otherInfoBean.setNationality("aaa");
		otherInfoBean.setReligion("bbb");
		otherInfoBean.setRollNum(18);

		bean.setOtherInfoBean(otherInfoBean);
		Session session = null;
		Transaction transaction = null;

		try {
			session = HibernateUtil.openSession();
			transaction = session.beginTransaction();
			session.save(bean);
			transaction.commit();
			log.info("inserted sucessfully");

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				e.printStackTrace();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
