package com.tyss.lms.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tyss.lms.dto.BookAllocateBean;
import com.tyss.lms.dto.BooksBean;

public interface BookAllRepository extends CrudRepository<BookAllocateBean,Integer> {

	/*
	 * @Query("select u from UserBean u where u.email=:email" ) public BooksBean
	 * searchByEmail(@Param("email") String email);
	 * 
	 * @Query(value
	 * ="select * from user_register e where e.book_name in(select e.book_name from user_register e where e.book_name like  %:book_name%)"
	 * ,nativeQuery = true) public List<BooksBean> searchByName(@Param("book_name")
	 * String bookName);
	 */
}