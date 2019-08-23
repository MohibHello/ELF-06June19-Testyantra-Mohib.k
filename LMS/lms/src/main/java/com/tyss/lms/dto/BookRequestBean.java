package com.tyss.lms.dto;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@SuppressWarnings("serial")
@JsonRootName(value = "book-request-bean")
@Table(name = "book request")
@Entity
@Data 
public class BookRequestBean implements Serializable {
	
	
	@Id
	@Column(name = "user_id")
	Integer userId;
	@Column(name = "book_id")
	Integer bookId;
	@Column(name = "request_sanction")
	boolean requestSanction;
}
