package com.greeter;

import javax.swing.JOptionPane;

public class PopupGreeter implements Greeter{
	
	private Visitor visitor;
	
	public void greet() 
	{	
		JOptionPane.showMessageDialog(null, visitor.getGreeting() + ", " + visitor.getName());
	}

	@Override
	public void setVisitor(Visitor v) {
		this.visitor = v;		
	}
}
