package com.greeter;

public class AmarilloVisitor implements Visitor {
	
	private String name;
	private String greeting;
	
	public AmarilloVisitor () { //default constructor
		this.greeting = "Harry";
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
