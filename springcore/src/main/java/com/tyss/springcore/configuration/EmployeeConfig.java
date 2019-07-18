package com.tyss.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.tyss.springcore.beans.EmployeeBean;

@Configuration
@Import(DepartmentConfig.class)
public class EmployeeConfig {
	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(101);
		employeeBean.setEname("lokesh");

		return employeeBean;
	}
}