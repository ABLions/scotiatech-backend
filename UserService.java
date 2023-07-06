package com.test.crud.services;

import com.test.crud.interfaces.IUser;
import com.test.crud.model.*;
import com.test.crud.repositories.IUserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class UserService implements IUser{
	
	private final IUserRepository iUserRepository;
	
	public UserService(IUserRepository iUserRepository) 
	{
		this.iUserRepository = iUserRepository;
	}
	
	public List<User> getAllUsers(){
		return (List<User>) iUserRepository.findAll();
	}
	
	public Optional<User> getUserById(Long id)
	{
		return iUserRepository.findById(id);
	}
	
	public User createUser(User user)
	{
		return iUserRepository.save(user);	
	}
	
	public User updateUser(Long id, User user) 
	{
		return iUserRepository.save(user);
	}
	
	public void deleteUser(Long id) {
		iUserRepository.deleteById(id);
	}

}
