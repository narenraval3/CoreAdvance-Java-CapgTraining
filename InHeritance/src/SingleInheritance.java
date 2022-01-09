import static java.lang.System.*;
class SingleParent
{
	private int num1;
	
	public void get1()
	{
		num1=100;
	}
	public void disp1()
	{
		out.println("NUM1 is: " +num1); //no need to write system because we import the package
	}
}
class SingleChild extends SingleParent
{
	private int num2;
	
	//if do not want to use super keyword then need to create an Object of Parent class
	SingleParent p = new SingleParent(); 
	
	public void get2()
	{
		p.get1();
		
		//super.get1();
		num2=200;
	}
	public void disp2()
	{
		p.disp1();
		
		//super.disp1();
		out.println("NUM2 is: " +num2);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		out.println("This is Single Inheritance Method");
		SingleChild c = new SingleChild();
		c.get2();
		c.disp2();
	}
}