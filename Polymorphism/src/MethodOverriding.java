//MethodOverriding is an example of Run time polymorphism

class Parent
{
	//private static int num1;
	private int num1;
	
	//public void get()
	public void get(int x)
	{
		//num1=1000;
		num1=x;
	}
	//public static void disp()
	public void disp()
	{
		System.out.println("MethodOverriding Parent class NUM1: " +num1);
	}
}
class Child extends Parent
{
	//private static int num2;
	private int num2;
	
	//public void get()
	public void get(int y)
	{
		//num2=2000;
		num2=y;
	}
	public void disp()
	//public static void disp()
	{
		System.out.println("MethodOverriding Child class NUM2: " +num2);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Parent pobj = new Parent();
		Child cobj = new Child();
		
		pobj.get(20);
		pobj.disp();
		
		pobj=cobj;   //parent reference the child 
		
		pobj.get(30);
		pobj.disp();
		
		//Parent.get();
		//Parent.disp();
		
		//Child.get();
		//Child.disp();
	}
}