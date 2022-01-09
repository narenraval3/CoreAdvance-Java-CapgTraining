package com.helloworldmvcapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	//http://localhost:8080/helloWorld
	
	@RequestMapping("/helloWorld")
	public ModelAndView showMessage()
	{
		Map mapModel = new HashMap();
		mapModel.put("greetings", "Welcome to Spring MVC Demo");
		
		ModelAndView modelAndView = new ModelAndView("hello", mapModel);
		return modelAndView;
	}

}
