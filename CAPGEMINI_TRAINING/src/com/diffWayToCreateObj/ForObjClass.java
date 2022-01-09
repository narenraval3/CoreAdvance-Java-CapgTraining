package com.diffWayToCreateObj;

public class ForObjClass implements Cloneable {
	
	private String name;
	private int id;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//For creating an object by clone method we need to implement Cloneable and override the clone method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
