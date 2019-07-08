package com.tyss.designpattern;

import java.text.ParseException;
import java.util.List;

import com.tyss.beans.EmployeeInfoBean;
import com.tyss.designpattern.dao.EmployeeDAO;
import com.tyss.designpattern.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
public class DesignPatternTest {
	public static void main(String[] args) throws ParseException {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();

//		EmployeeDAOJDBCImpl dao = new EmployeeDAOJDBCImpl();

//		EmployeeInfoBean bean = new EmployeeInfoBean();

//		EmployeeInfoBean bean2 = dao.getEmployeeInfo("105");
//		printInfo(bean);

		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
		for (EmployeeInfoBean bean : beans) {
			printInfo(bean);
		}

		/*
		 * EmployeeInfoBean empinf = new EmployeeInfoBean(); SimpleDateFormat format =
		 * new SimpleDateFormat("yyyy-mm-dd"); Date joiningDate =
		 * format.parse("2002-04-23"); Date dobDate = format.parse("1993-04-12");
		 * empinf.setId(120); empinf.setName("JAMESS"); empinf.setAge(25);
		 * empinf.setAccountNumber(656435433); empinf.setDepartmentId(2);
		 * empinf.setDesignation(" IT ANALYST"); empinf.setDob(dobDate);
		 * empinf.setJoiningDate(joiningDate); empinf.setEmail("james111@gmail.com");
		 * empinf.setGender("male"); empinf.setManagerId(122); empinf.setSalary(25000);
		 * empinf.setPhone(855664);
		 * 
		 * dao.deleteEmployeeInfo(0);
		 */

		// log.info(" Created the employee ? : " + dao.deleteEmployeeInfo(0));
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
