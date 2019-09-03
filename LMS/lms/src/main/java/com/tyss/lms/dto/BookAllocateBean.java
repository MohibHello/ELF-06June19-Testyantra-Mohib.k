package com.tyss.lms.dto;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name="book_allotment")
public class BookAllocateBean implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="book_allotment_id")
	private Integer bookAllotmentId;
	//@JsonIgnore
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserBean userId;
	//@JsonIgnore
	@ManyToOne
	@JoinColumn(name="book_id")
	private BooksBean bookId;
	@Column(name="issue_date")
	private Date issueDate;
	@Column(name="return_date")
	private Integer returnDate;
	@Column(name="status")
	private String status;
}