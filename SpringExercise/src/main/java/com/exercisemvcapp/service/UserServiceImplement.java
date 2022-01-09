package com.exercisemvcapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.exercisemvcapp.dao.UserRepository;
import com.exercisemvcapp.exception.UserNotFoundException;
import com.exercisemvcapp.model.User;

public class UserServiceImplement implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		List<User> userList = (List<User>) userRepository.findAll();
		return userList;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> userList = (List<User>) userRepository.findAll();
		return userList;
	}
	
	@Override
	public Boolean insertUser(User user) {
		
		User usr = (User) userRepository.save(user);
		
		if(usr!=null)
		{
			return true;
		}
		return false;
	}

	@Override
	public User getUserById(Integer Id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer Id) throws DataAccessException, UserNotFoundException {
		// TODO Auto-generated method stub
		
	}
}