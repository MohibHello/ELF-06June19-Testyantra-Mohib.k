package com.tyss.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.tyss.dto.EmployeeInfoBean;

public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer> {

}
