package com.tyss.lms.controller;

import org.springframework.data.repository.CrudRepository;

import com.tyss.lms.dto.BooksBean;

public interface BookRepository extends CrudRepository<BooksBean, Integer> {

}
