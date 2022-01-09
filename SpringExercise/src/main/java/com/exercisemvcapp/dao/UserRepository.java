package com.exercisemvcapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.exercisemvcapp.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	

}
