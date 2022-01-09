package com.exercisemvcapp.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.exercisemvcapp.exception.UserNotFoundException;
import com.exercisemvcapp.model.User;

public interface UserService {
	
	public List<User> getUser();
	public List<User> getAllUser();
	
	public Boolean insertUser(User user);


	public User getUserById(Integer Id) throws UserNotFoundException;
	public void deleteUser(Integer Id) throws DataAccessException, UserNotFoundException;
	
}
