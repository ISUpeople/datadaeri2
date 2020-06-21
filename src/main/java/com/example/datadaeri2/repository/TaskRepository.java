package com.example.datadaeri2.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.datadaeri2.entity.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String>{

	List<Task> findAll();
	List<Task> findByOwner(String owner);
}