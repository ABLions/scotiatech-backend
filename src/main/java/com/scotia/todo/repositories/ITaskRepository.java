package com.scotia.todo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.scotia.todo.entities.*;


public interface ITaskRepository  extends CrudRepository<Task, Long>{

}
