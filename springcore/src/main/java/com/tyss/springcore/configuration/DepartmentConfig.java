package com.tyss.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {

	@Bean(name = "it")
	public DepartmentBean getDepartmentBeanIt() {

		DepartmentBean deptBean = new DepartmentBean();
		deptBean.setDeptId(666);
		deptBean.setDeptName("IT");
		return deptBean;
	}

	@Bean(name = "network")
	public DepartmentBean getDepartmentBeanNetwork() {

		DepartmentBean deptBean = new DepartmentBean();
		deptBean.setDeptId(444);
		deptBean.setDeptName("Network");
		return deptBean;
	}

	@Bean(name = "hr")
	public DepartmentBean getDepartmentBeanHr() {

		DepartmentBean deptBean = new DepartmentBean();
		deptBean.setDeptId(999);
		deptBean.setDeptName("HR");
		return deptBean;
	}

}
