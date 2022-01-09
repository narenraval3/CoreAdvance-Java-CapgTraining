package com.annotation.demo;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("greeter")
@Scope("prototype")
public class PopupGreeter implements Greeter{
	
	private Visitor visitor;
	
	public void greet() 
	{	
		JOptionPane.showMessageDialog(null, visitor.getGreeting() + ", " + visitor.getName());
	}

	@Autowired
	public void setVisitor(Visitor v) {
		this.visitor = v;		
	}
}
