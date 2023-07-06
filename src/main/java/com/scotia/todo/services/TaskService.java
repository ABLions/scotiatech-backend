package com.scotia.todo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.scotia.todo.entities.Task;
import com.scotia.todo.interfaces.ITask;
import com.scotia.todo.repositories.ITaskRepository;

@Service
public class TaskService implements ITask{
	
	private final ITaskRepository iTaskRepository;
	
	public TaskService(ITaskRepository iTaskRepository) {
		this.iTaskRepository = iTaskRepository;
	}
	
	public List<Task> getAllTasks(){
		return (List<Task>) iTaskRepository.findAll();
	}
	
	public Optional<Task> getTaskById(Long id){
		return iTaskRepository.findById(id);
	}
	
	public Task saveTask(Task task) {
		return iTaskRepository.save(task);
	}
	
	public Task updateTask(Long id, Task task) {
		return iTaskRepository.save(task);
	}
	

	public void deleteTask(Long id) {
		iTaskRepository.deleteById(id);
		
	}

}
