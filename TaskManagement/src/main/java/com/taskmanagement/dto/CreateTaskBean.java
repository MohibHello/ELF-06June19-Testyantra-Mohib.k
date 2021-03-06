package com.taskmanagement.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@Entity
@Table(name = "assign_task")
@JsonRootName("Assign-Task")
@SuppressWarnings(value = { "serial" })
public class CreateTaskBean implements Serializable {

	@Id
	@Column(name = "task_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskId;
	@Column(name = "description")
	private String description;
	@Column(name = "subject")
	private String subject;
	@Column(name = "end_date")
	private LocalDate endDate;
	@Column(name = "priority")
	private String priority;
	@Column(name = "assign_date")
	@CreationTimestamp
	private LocalDate assignDate;
	@Column(name = "assigned_to")
	private String assignedTo;
	@Column(name = "status")
	private String status;

	@ManyToOne
	@JoinColumn(name = "empId")
	private UserBean userBean;
}
