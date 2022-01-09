package com.exercisemvcapp.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.exercisemvcapp.dao.UserRepository;
import com.exercisemvcapp.exception.UserNotFoundException;

@Component
public class UserServiceImpl implements UserService {

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
	public Boolean addUser(User user) {
		// TODO Auto-generated method stub
		User userObj = userRepository.save(user);
		if (userObj != null) {
			return true;
		}
		return false;
	}

	@Override
	public User getUserById(Integer Id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.findById(Id).orElseThrow(UserNotFoundException::new);
	}
	
	@Override
	public void deleteUser(Integer Id) throws DataAccessException, UserNotFoundException {
		// TODO Auto-generated method stub
		userRepository.delete(getUserById(Id));
	}

}
