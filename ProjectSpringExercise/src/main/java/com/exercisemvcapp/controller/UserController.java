package com.exercisemvcapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exercisemvcapp.model.User;
import com.exercisemvcapp.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	public ModelAndView saveEmployee(@ModelAttribute User user) {

		String successMsg = "User Added Successfully!!..";
		String errorMsg   = "Unable to Add User!!!...";

		Boolean isUserInserted = userService.addUser(user);
		
		ModelAndView modelAndView; // Model is Spring Web is a map
		Map messageModel = new HashMap();
		if (isUserAdded) {
			messageModel.put("userData", user);
			modelAndView = new ModelAndView("successAdd", messageModel);
		} else {
			messageModel.put("errorMsg", errorMsg); // ModelAndView(viewName,model)
			modelAndView = new ModelAndView("error", messageModel);
		}

		return modelAndView;
	}

	@GetMapping("/user")
	public ModelAndView getEmployeeForm(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("adduser");

		return modelAndView;
	}

}
