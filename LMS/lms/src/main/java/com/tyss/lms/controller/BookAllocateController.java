package com.tyss.lms.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.BookAllocateBean;
import com.tyss.lms.dto.Response;

import lombok.extern.java.Log;

@CrossOrigin(origins = "http://localhost:3000")
@EntityScan(basePackages = "com.tyss.lms")
@RestController
@Log
public class BookAllocateController {

	@Autowired
	BookAllRepository repo;

	@PostMapping(path = "/createAllocate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Response createEmp(@RequestBody BookAllocateBean bean) {
		Response response = new Response();
		if (!repo.existsById(bean.getBookAllotmentId())) {
			response.setStatusCode(201);
			repo.save(bean);
			response.setMessage("success");
			response.setDescription("Book data inserted successfully ");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("book data not inserted");
		}
		return response;
	}

	@GetMapping(path = "/getBookDetail", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getBookDetail(@RequestParam int id, HttpServletRequest request) {
		Response response = new Response();

		// if(request.getSession(false)!=null) {

		System.out.println(repo.existsById(id));
		
		
		if (repo.existsById(id)) {
			BookAllocateBean bean = repo.findById(id).get();
			
			System.out.println(bean.toString());
			
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("book data found successfully ");
			response.setBeans(Arrays.asList(bean));
			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" data not  found");
			return response;
		}
		/*
		 * } else { response.setStatusCode(501); response.setMessage("Failure");
		 * response.setDescription("Please login first"); return response; }
		 */

	}
}
