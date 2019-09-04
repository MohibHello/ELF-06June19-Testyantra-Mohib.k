package com.taskmanagement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.dto.UserBean;
import com.taskmanagement.repo.TaskRepository;
import com.taskmanagement.repo.UserRepository;
import com.taskmanagement.response.Response;

@RestController
public class SearchController {

	@Autowired
	UserRepository repository;
	@Autowired
	TaskRepository taskRepository;

	@GetMapping(path = "/getUserByName", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getUserByName(@RequestParam("name") String name, HttpServletRequest req) {
		Response response = new Response();

		if (req.getSession(false) != null) {
			if (repository.existsByEmpName(name) > 0) {
				List<UserBean> userBean = repository.findByEmpName(name);
				response.setStatusCode(201);
				response.setMessage("Successsfull");
				response.setDescription("Data found");

				response.setUserBean(userBean);
			} else {
				response.setStatusCode(401);
				response.setMessage("Failed");
				response.setDescription("Data is  not found");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("Login First");
		}

		return response;
	}// End of getUserByName()

	@GetMapping(path = "/getTaskByPriority", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response getTaskByPriority(@RequestParam("priority") String priority, HttpServletRequest req) {

		Response response = new Response();
		if (req.getSession(false) != null) {
			if (taskRepository.countTask(priority) > 0) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Task data found successfully");
				response.setTaskBean(taskRepository.getTaskByPriority(priority));
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Task data not found");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("Login First");
		}

		return response;
	}// End of getTaskByPriority()

	@GetMapping(path = "/getAssignToTask", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response getAssignToTask(@RequestParam("email") String email, HttpServletRequest req) {

		Response response = new Response();
		if (req.getSession(false) != null) {
			if (repository.existsByEmail(email)) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("All Task data assigned Found ");
				response.setTaskBean(taskRepository.getAssignTo(email));

				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Task data not found");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("Login First");
		}
		return response;
	}// End of getAssignToTask()

	@GetMapping(path = "/getAssignedTask", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response getAssignedTask(@RequestParam("email") String email, HttpServletRequest req) {

		Response response = new Response();
		if (req.getSession(false) != null) {
			if (repository.existsByEmail(email)) {

				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("All Task Assigned Found Successfully");
				response.setTaskBean(taskRepository.getAssignedTask(email));

				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Task data not found");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("Login First");
		}

		return response;
	}// End of getAssignedTask()

}
