//This is parent class
class Parent
{
	private int num1;
	
	public void get()
	{
		num1=100;
	}
	public void disp()
	{
		System.out.println("Parent Value is NUM1: " +num1);
	}
}
//This is child class 
class Child extends Parent // extends keyword is used for declaring Child is inherited from Parent  
{
	private int num2;
	
	public void get1()
	{
		super.get();  //super keyword is used for inheriting parent properties in child class
		num2=200;
	}
	public void disp1()
	{
		super.disp();
		System.out.println("Child Value is NUM2: " +num2);
	}
}

//This is main class
public class Inheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.get1();
		c.disp1();
	}
}