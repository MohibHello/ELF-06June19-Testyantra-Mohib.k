package com.tyss.designpattern;

import com.tyss.beans.EmployeeInfoBean;
import com.tyss.designpattern.dao.EmployeeDAO;
import com.tyss.designpattern.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
public class DesignPatternTest {
	public static void main(String[] args) {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
//		EmployeeDAOJDBCImpl dao = new EmployeeDAOJDBCImpl();
		EmployeeInfoBean bean = dao.getEmployeeInfo(102);
//		EmployeeInfoBean bean2 = dao.getEmployeeInfo("105");
		printInfo(bean);
		/*
		 * ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfo(); for
		 * (EmployeeInfoBean Bean : beans) { printInfo(bean); }
		 */
	}

	private static void printInfo(EmployeeInfoBean bean1) {

		log.info("ID 		        ---" + bean1.getId());
		log.info("NAME			    ---" + bean1.getName());
		log.info("AGE 			    ---" + bean1.getAge());
		log.info("GENDER			---" + bean1.getGender());
		log.info("SALARY  		    ---" + bean1.getSalary());
		log.info("PHONE  		  	---" + bean1.getPhone());
		log.info("JOINING_DATE	    ---" + bean1.getJoiningDate());
		log.info("ACCCOUNT_NUMBER   ---" + bean1.getAccountNumber());
		log.info("EMAIL  			---" + bean1.getEmail());
		log.info("DESIGNATION  	    ---" + bean1.getDesignation());
		log.info("DOB        		---" + bean1.getDob());
		log.info("DEPT_NO (FK)   	---" + bean1.getDepartmentId());
		log.info("MGR_ID			---" + bean1.getManagerId());
	}
}
