package com.tyss.hibernatemapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernatemapping.dto.EmployeeAddressInfoBean;
import com.tyss.hibernatemapping.dto.EmployeeEducationalInfoBean;
import com.tyss.hibernatemapping.dto.EmployeeExperienceInfoBean;
import com.tyss.hibernatemapping.dto.EmployeeInfoBean;
import com.tyss.hibernatemapping.dto.EmployeeOtherInfoBean;
import com.tyss.hibernatemapping.dto.TrainingInfoBean;

public class HibernateImpl {

	private Configuration config = new Configuration();

	private SessionFactory factory = config.configure().buildSessionFactory();

	public void createemployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeAddressInfoBean> addressInfoBean, List<EmployeeEducationalInfoBean> educationalInfoBeans,
			List<EmployeeExperienceInfoBean> experienceInfoBeans) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBean) {
			session.save(employeeAddressInfoBean);
		}
		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : educationalInfoBeans) {
			session.save(employeeEducationalInfoBean);
		}
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : experienceInfoBeans) {
			session.save(employeeExperienceInfoBean);
		}
		transaction.commit();
		session.close();
	}

	public void createTrainingDetail(TrainingInfoBean trainingInfoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainingInfoBean);
	}
}
