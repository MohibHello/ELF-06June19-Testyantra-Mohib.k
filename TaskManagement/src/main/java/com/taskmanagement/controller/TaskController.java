package com.taskmanagement.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.dto.CreateTaskBean;
import com.taskmanagement.repo.TaskRepository;
import com.taskmanagement.repo.UserRepository;
import com.taskmanagement.response.Response;

import lombok.extern.java.Log;

@Log
@RestController
public class TaskController {

	@Autowired
	TaskRepository taskRepository;
	@Autowired
	UserRepository userRepository;

	@GetMapping(path = "/getTask", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response getTask(@RequestParam("id") int id, HttpServletRequest req) {

		Response response = new Response();
		if (req.getSession(false) != null) {
			if (taskRepository.existsById(id)) {
				CreateTaskBean bean = taskRepository.findById(id).get();
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Task data found successfully");
				response.setTaskBean(Arrays.asList(bean));
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
	}// End of getTask()

	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response createTask(@RequestBody CreateTaskBean task, HttpServletRequest req) {

		Response response = new Response();
		if (req.getSession(false) != null) {
			if (userRepository.existsById(task.getUserBean().getEmpId())) {

				log.info("msg" + task.toString());
				taskRepository.save(task);
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Task added successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("user id does not exist ");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("Login First");
		}

		return response;

	}// End of createTask()

	@PostMapping(value = "/updateTaskStatus", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response updateStatus(@RequestParam("taskId") int taskId, @RequestParam("status") String status,
			HttpServletRequest req) {
		CreateTaskBean taskbean = taskRepository.findById(taskId).get();
		Response response = new Response();
		if (req.getSession(false) != null) {
			if (taskbean != null) {
				taskbean.setStatus(status);
				taskRepository.save(taskbean);
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Status Change successfully");

			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Status not Changed");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("LoginFirst");
		}

		return response;
	}

	@GetMapping(path = "/getAllTask", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response getAllTask(HttpServletRequest req) {

		Response response = new Response();
		if (req.getSession(false) != null) {
			if (taskRepository.findAll() != null) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Task data found successfully");
				response.setTaskBean(taskRepository.findAll());
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Task data not found");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("LoginFirst");

		}
		return response;

	}// End of getAlTask()

}
