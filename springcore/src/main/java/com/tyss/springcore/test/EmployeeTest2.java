package com.tyss.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest2 {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		EmployeeBean Emp1 = (EmployeeBean) applicationContext.getBean("employee1");

		// EmployeeBean Emp2 = (EmployeeBean) applicationContext.getBean("employee1");

		/*
		 * Scanner sc = new Scanner(System.in); log.info("Enter Id :");
		 * Emp1.setEid(sc.nextInt()); sc.nextLine(); log.info("Enter Name :");
		 * Emp1.setEname(sc.nextLine());
		 * 
		 * log.info("Enter Name2 :"); Emp2.setEname(sc.nextLine());
		 * log.info("Enter Id2 :"); Emp2.setEid(sc.nextInt()); sc.nextLine();
		 */
		log.info("Dept Id " + Emp1.getDepartmentBean().getDeptId());
		log.info("Dept name :" + Emp1.getDepartmentBean().getDeptName());
		log.info("employee name : " + Emp1.getEname());
		log.info("employee id : " + Emp1.getEid());

//		log.info("employee name2 : " + Emp2.getEname());
//		log.info("employee id2 : " + Emp2.getEid());

		((AbstractApplicationContext) applicationContext).registerShutdownHook();
	}
}
