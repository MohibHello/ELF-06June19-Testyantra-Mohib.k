package com.tyss.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class EmployeeBean {

	private String ename;
	private int eid;

	@Autowired
	@Qualifier("hr")
	private DepartmentBean departmentBean;

	/*
	 * @PreDestroy public void destroy() throws Exception {
	 * log.info("destory phase......"); }
	 * 
	 * @PostConstruct public void init() throws Exception {
	 * log.info("initial Phase....."); }
	 */
}
