package com.tyss.lms.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@SuppressWarnings("serial")
@JsonRootName(value = "book-borrowed-bean")
@Table(name = "book borrowed")
@Entity
@Data
public class BookBorrowedBean {

	@Id
	@Column(name = "book_id")
	Integer id;
	@Column(name = "date_issued")
	Date dateIssued;
	@Column(name = "due_date")
	Date DueDate;
	@Column(name = "fine")
	Integer fine;
	@Column(name = "book_renew")
	Date bookRenew;
	@Column(name = "user_id")
	Integer uid;
	
}
