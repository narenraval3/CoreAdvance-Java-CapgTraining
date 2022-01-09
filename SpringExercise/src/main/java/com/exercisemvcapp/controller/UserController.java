package com.exercisemvcapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exercisemvcapp.model.User;
import com.exercisemvcapp.service.UserService;

public class UserController {
	
	@Autowired
	private UserService userService;

///////INSERT USER DATA---------------------------------------------------------------------	
	//@RequestMapping(method=RequestMethod.POST)
	@PostMapping("/insertUsers")
	public ModelAndView saveEmployee(@ModelAttribute User user) {

		String successMsg = "User Added Successfully!!..";
		String errorMsg   = "Unable to Add User!!!...";

		Boolean isUserInserted = userService.insertUser(user);
		
		ModelAndView modelAndView; 
		Map messageModel = new HashMap();
		
		if (isUserInserted) 
		{
			messageModel.put("userData", user);
			modelAndView = new ModelAndView("successInsert", messageModel);
		} 
		else {
			messageModel.put("errorMessage", errorMsg); 
			modelAndView = new ModelAndView("errorInsert", messageModel);
		}
		return modelAndView;
	}

	@GetMapping("/userform")
	public ModelAndView getEmployeeForm(@ModelAttribute User user) 
	{
		ModelAndView modelAndView = new ModelAndView("insertUser");

		return modelAndView;
	}

}
