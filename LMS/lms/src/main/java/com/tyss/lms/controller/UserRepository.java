package com.tyss.lms.controller;

import org.springframework.data.repository.CrudRepository;

import com.tyss.lms.dto.UserBean;

public interface UserRepository extends CrudRepository<UserBean, Integer> {

		
}
