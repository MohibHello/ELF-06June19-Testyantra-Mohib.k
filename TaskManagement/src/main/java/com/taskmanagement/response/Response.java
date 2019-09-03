package com.taskmanagement.response;

import java.util.List;

import com.taskmanagement.dto.CreateTaskBean;
import com.taskmanagement.dto.UserBean;

import lombok.Data;

@Data
public class Response {

	private int statusCode;

	private String message;

	private String description;

	private List<UserBean> userBean;

	private List<CreateTaskBean> taskBean;
}
