package com.tyss.springcore.beans;

import lombok.Data;

@Data
public class EmployeeBean {

	private String ename;
	private int eid;
	private DepartmentBean departmentBean;

	/*
	 * public void destroy() throws Exception { log.info("destory phase......"); }
	 * 
	 * public void afterPropertiesSet() throws Exception {
	 * log.info("initial Phase....."); }
	 */
}
