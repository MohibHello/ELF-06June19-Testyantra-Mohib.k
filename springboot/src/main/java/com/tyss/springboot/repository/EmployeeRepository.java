package com.tyss.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tyss.dto.EmployeeInfoBean;
import com.tyss.dto.EmployeeOtherInfoBean;

public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer> {

	@Query("select e from EmployeeOtherInfoBean e where e.infoBean=:id")
	public EmployeeOtherInfoBean findByEmpid(@Param("id") EmployeeInfoBean id);
}
