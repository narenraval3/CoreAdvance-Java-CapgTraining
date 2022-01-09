package com.exercisemvcapp.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.dao.DataAccessException;

import com.exercisemvcapp.exception.UserNotFoundException;

public interface UserService {

	public List<User> getUser();

	public List<User> getAllUser();

	public Boolean addUser(com.exercisemvcapp.model.User user);

	public User getUserById(Integer Id) throws UserNotFoundException;

	public void deleteUser(Integer Id) throws DataAccessException, UserNotFoundException;

}
