package com.annotation.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("amriloVis")
@Scope(value="prototype")
public class AmarilloVisitor implements Visitor {
	
	private String name;
	private String greeting;
	
	public AmarilloVisitor () { //default constructor
		this.greeting = "Hii";
		this.name = "Harry";
	}
	
	public void setGreeting() {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return greeting;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}	
}
