package com.tyss.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.DepartmentBean;
import com.tyss.springcore.beans.EmployeeBean;
import com.tyss.springcore.configuration.EmployeeConfig;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean empbean = context.getBean(EmployeeBean.class);

		log.info("Name :- " + empbean.getEname());
		log.info("ID :- " + empbean.getEid());

		DepartmentBean deptbean = empbean.getDepartmentBean();
		log.info("dept id :- " + deptbean.getDeptId());
		log.info("dept name :- " + deptbean.getDeptName());

	}
}
