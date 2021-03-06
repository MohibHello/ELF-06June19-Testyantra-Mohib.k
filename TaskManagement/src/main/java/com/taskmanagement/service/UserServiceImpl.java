package com.taskmanagement.service;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanagement.dto.Response;
import com.taskmanagement.dto.UserBean;
import com.taskmanagement.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	// Login service For Task Management
	@Override
	public Response login(String email, String password, HttpServletRequest req) {
		Response response = new Response();
		if (repository.existsByEmail(email)) {
			UserBean bean = repository.findByEmail(email).get();
			if (bean != null && bean.getPassword().equals(password)) {

				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Login successfully");
				req.getSession().setAttribute("bean", bean);
				response.setUserBean(Arrays.asList(bean));

			} else {
				response.setStatusCode(401);
				response.setMessage("Failed");
				response.setDescription("Login Failed");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Email not present");
			response.setDescription("email does not exist");
		}
		return response;
	}// End of login()

	// service to add new user
	@Override
	public Response createUser(UserBean user) {
		Response response = new Response();
		if (!repository.existsByEmail(user.getEmail())) {

			repository.save(user);
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("user id already exist ");
		}
		return response;
	}// End of createUser()

	// service to update existing user
	@Override
	public Response updateUser(UserBean user) {
		Response response = new Response();
		
		
		String newMail=user.getEmail().trim();
		
		if (repository.existsById(user.getEmpId())) {
			
			
			
			repository.save(user);
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User updated successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("data not found for registered email ");
		}
		return response;
	}// End of updateUser()

	// service to updated password
	@Override
	public Response updatePassword(String password, String email, HttpServletRequest req) {
		Response response = new Response();

		if (repository.existsByEmail(email)) {
			UserBean bean = repository.findByEmail(email).get();
			bean.setPassword(password);
			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Password was reset");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("password did not change");

		}
		return response;
	}// End of updatePassword()

	// logout service for session invalidation
	@Override
	public Response logout(HttpSession session) {
		Response response = new Response();
		session.invalidate();
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Logout successfully");
		return response;
	}// End of logout()

}// End of class
