package com.taskmanagement.controller;

import java.util.Arrays;
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
	public Response getUserByName(@RequestParam("name") String name) {
		Response responseData = new Response();

		if (repository.existsByEmpName(name) > 0) {

			List<UserBean> userBean = repository.findByEmpName(name);
			responseData.setStatusCode(201);
			responseData.setMessage("Successsfull");
			responseData.setDescription("Data found");

			responseData.setUserBean(userBean);
		} else {
			responseData.setStatusCode(401);
			responseData.setMessage("Failed");
			responseData.setDescription("Data is  not found");
		}

		return responseData;
	}//End of getUserByName()
	
	@GetMapping(path = "/getTaskByPriority", 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response getTaskByPriority(@RequestParam("priority") String priority, HttpServletRequest req) {
		
		      Response response = new Response();
			if (taskRepository.countTask(priority)>0) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Task data found successfully");
				response.setTaskBean(taskRepository.getTaskByPriority(priority));
				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Task data not found");
			

			return response;
			}
	}//End of getTaskByPriority()
	

	@GetMapping(path = "/getAssignToTask", 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response getAssignToTask(@RequestParam("email") String email, HttpServletRequest req) {
		
		Response response = new Response();
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
			
		    	return response;
			}//End of getAssignToTask()
	}
	
	
	@GetMapping(path = "/getAssignedTask", 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response getAssignedTask(@RequestParam("email") String email, HttpServletRequest req) {
		
		Response response = new Response();
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
			

			return response;
			}//End of getAssignedTask()
	}

}
