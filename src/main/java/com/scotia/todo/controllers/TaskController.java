package com.scotia.todo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scotia.todo.entities.Task;
import com.scotia.todo.interfaces.ITask;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {
	
	private final ITask iTask;
	
	public TaskController(ITask iTask) {
		this.iTask = iTask;
	}
	
	@GetMapping
	public List<Task> getAllTasks(){
		try {
			return iTask.getAllTasks();			
		}catch(Error error) {
			System.out.println(error);
		}
		return null;
	}
	
	@GetMapping("/{id}")
	public Optional<Task> getTaskById(@PathVariable Long id){
		try {
			if(id != null) {
				return iTask.getTaskById(id);				
			} else {
				System.out.println("id null");
			}
			
		}catch(Error error) {
			System.out.println(error);
		}
		return null;
	}
	
	@PostMapping
	public Task saveTask(@RequestBody Task task) {
		try {
			return iTask.saveTask(task);
		}catch(Error error) {
			System.out.println(error);
		}
		return null;
	}
	
	@PutMapping("/{id}")
	public Task updateTask(@PathVariable Long id, @RequestBody Task task ) {
		try {
			return iTask.updateTask(id, task);
		}catch(Error error) {
			System.out.println(error);
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Long id) {
		try {
			iTask.deleteTask(id);
			System.out.println("item id" + id + "deleted");
		}catch(Error error) {
			System.out.println(error);
		}
	}
	
	
}
