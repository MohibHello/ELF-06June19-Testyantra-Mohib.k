package com.tyss.lms.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.Response;
import com.tyss.lms.dto.UserBean;

@CrossOrigin(origins = "http://localhost:3000")
@EntityScan(basePackages = "com.tyss.lms")
@RestController
public class AdminController {

	@Autowired
	UserRepository repository;

	@GetMapping(path = "/getUser", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response getUser(@RequestParam int id, @RequestParam String password, HttpServletRequest req) {

		Response response = new Response();
		// if (req.getSession(false) != null) {
		if (repository.existsById(id)) {
			UserBean bean = repository.findById(id).get();

			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User data found successfully");
			response.setBeans(Arrays.asList(bean));

			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User data not found");

			return response;
		}
		/*
		 * } else { response.setStatusCode(501); response.setMessage("Failure");
		 * response.setDescription("plz login first"); return response; }
		 */
	}
	 @GetMapping(path ="/getUserByName",produces = MediaType.APPLICATION_JSON_VALUE)
	 public Response getUserByName(@RequestParam("name")String name) {
	 Response response=new Response();
	   if(repository.existsByUserName(name)) {
		   response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User data found successfully");
	    response.setBeans(Arrays.asList(repository.findByUserName(name)));
	    return response;
	   }
	   else {
		   response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User data not found");

	 return response;
	 }
	 }

	
	

	@PostMapping(path = "/addUser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Response createUser(@RequestBody UserBean bean) {

		Response response = new Response();
		// if (req.getSession(false) != null) {
		if (!repository.existsById(bean.getUserId())) {
			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User Data added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User id already exists");
		}
		return response;
	}

	@DeleteMapping(path = "/deleteUser", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response deleteUser(@RequestParam("userId") int id, HttpServletRequest req) {
		Response response = new Response();
		// if (req.getSession(false) != null) {
		UserBean infoBean = repository.findById(id).get();

		if (repository.existsById(infoBean.getUserId())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User data deleted successfully");
			repository.delete(infoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User data not found");
		}

		return response;

		/*
		 * } else { response.setStatusCode(501); response.setMessage("Failure");
		 * response.setDescription("plz login first"); return response; }
		 */
	}
	

	@PatchMapping(path = "/updateUserData", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response updateUser(@RequestBody UserBean infoBean, HttpServletRequest req) {

		Response response = new Response();
		if (repository.existsById(infoBean.getUserId())) {

			repository.save(infoBean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("User Data updated successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User id in db already exists");
		}
		return response;

		/*
		 * } else { response.setStatusCode(501); response.setMessage("Failure");
		 * response.setDescription("plz login first"); return response; }
		 */
	}

}
