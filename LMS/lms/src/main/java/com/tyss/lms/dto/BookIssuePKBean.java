package com.tyss.lms.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Embeddable
public class BookIssuePKBean implements Serializable {
	
	@JsonIgnore
	@OneToMany
	@JoinColumn(name = "userId")
	private UserBean bean;

	@Column(name = "book_id")
	private String bookId;

}
