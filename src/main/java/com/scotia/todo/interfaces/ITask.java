package com.scotia.todo.interfaces;

import java.util.List;
import java.util.Optional;

import com.scotia.todo.entities.Task;

public interface ITask {
	
	List<Task> getAllTasks();
	
	Optional<Task> getTaskById(Long id);
	
	Task saveTask(Task task);
	
	Task updateTask(Long id, Task task);
	
	void deleteTask(Long id);

}
