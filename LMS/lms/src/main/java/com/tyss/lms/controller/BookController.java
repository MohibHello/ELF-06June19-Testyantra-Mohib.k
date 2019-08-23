package com.tyss.lms.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.BookAllocateBean;
import com.tyss.lms.dto.BookRequestBean;
import com.tyss.lms.dto.BooksBean;
import com.tyss.lms.dto.Response;


@CrossOrigin(origins = "http://localhost:3000")
@EntityScan(basePackages = "com.tyss.lms")
@RestController
public class BookController {
	@Autowired
	BookRepository repository;


	@GetMapping(path = "/getBook", 
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response getBook(@RequestParam("bookId") int id, HttpServletRequest req) {
		
		Response response = new Response();
		//if (req.getSession(false) != null) {
			if (repository.existsById(id)) {
				BooksBean bean = repository.findById(id).get();
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Book data found successfully");
				response.setBeans(Arrays.asList(bean));
				
				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Book data not found");
			

			return response;}
		/*
		 * } else { response.setStatusCode(501); response.setMessage("Failure");
		 * response.setDescription("plz login first"); return response; }
		 */
	}
	@PostMapping(path = "/addBook", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Response addBook(@RequestBody BooksBean bean) {
		
		Response response = new Response();
		if (!repository.existsById(bean.getBookId())) {
			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Book Data added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book id already exists");
		}
		return response;
	}
	
	@DeleteMapping(path = "/deleteBook", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response removeBook(@RequestParam("bookId") int id, HttpServletRequest req) {
		Response response = new Response();
		
		BooksBean infoBean = repository.findById(id).get();
		
		if (repository.existsById(infoBean.getBookId())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Book data deleted successfully");
			repository.delete(infoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book data not found");
		}

		return response;

	}
	
	
	
}
