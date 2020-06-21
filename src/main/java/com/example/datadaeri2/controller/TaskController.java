package com.example.datadaeri2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.datadaeri2.entity.Task;
import com.example.datadaeri2.repository.TaskRepository;


/**
 * @author yewon
 *
 */
@RestController
@RequestMapping("/task/*")
public class TaskController {

	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
	@Autowired
	private TaskRepository taskRepository;
	
	@GetMapping("/readAll")
	public List<Task> readAll() {
		List<Task> ret = taskRepository.findAll();
		return ret;
	}
	
	//need to be implemented
	@PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
	public String create(@RequestBody Task task) {
	    
		taskRepository.save(task);
		logger.info("create new task\n Task id : ");
		return "success";
	}
}
