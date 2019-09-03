package com.tyss.lms.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.tyss.lms.dto.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Integer> {

	/*
	* @Query("Select e from UserBean e where e.infoBean=:id") public UserBean
	* findByEmpId(@Param("id") UserBean id);
	*/

	 public UserBean findByUserName(String name);
	 
	 public boolean existsByUserName(String name);
}
