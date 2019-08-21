package com.tyss.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@SuppressWarnings("serial")
@JsonRootName(value = "Book-bean")
@Table(name = "books")
@Entity
@Data
public class BooksBean implements Serializable {

	@Id
	@Column(name = "id")	
	private Integer id;
	@Column(name = "book_title")
	private String bookTitle;
	@Column(name = "book_author")
	private String bookAuthor;
	@Column(name = "category")
	private String category;
	@Column(name = "available")
	private Boolean available;
	@Column(name = "number_of_copies")
	private Integer numberOfCopies;
	
}
