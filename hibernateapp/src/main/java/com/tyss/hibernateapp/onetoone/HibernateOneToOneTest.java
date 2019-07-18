package com.tyss.hibernateapp.onetoone;

import java.text.ParseException;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hibernateapp.util.HibernateUtil;
import com.tyss.hibernateapp.util.PrepareDataUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {

	public static void main(String[] args) throws ParseException {

		int id = 155;
		EmployeeInfoBean data = PrepareDataUtil.prepareData(id);
		save(data);
	}// End of Main

	private static void save(EmployeeInfoBean data) {
		Transaction txn = null;
		try (Session session = HibernateUtil.openSession()) {
			txn = session.beginTransaction();
			session.save(data);
			txn.commit();
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			txn.rollback();
		} // End of Try-Catch
	}
}// End of Class
