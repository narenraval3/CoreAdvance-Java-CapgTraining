import static java.lang.System.*;
class ConParent
{
	private int num1;
	
	//public ConParent()
	public ConParent(int a)
	{
		//num1=100;	
		num1=a;
	}
	public void disp()
	{
		out.println("NUM1 is: " +num1);
	}
}
class ConChild extends ConParent
{
	private int num2;
	
	//public ConChild();
	public ConChild(int b)
	{
		//super();
		//num2=200;	
		
		super(1000);
		num2=b;
	}
	public void show()
	{
		super.disp();
		out.println("NUM2 is: " +num2);
	}
}

public class SingleInheritanceConstructor {

	public static void main(String[] args) {
		out.println("This is Single Inheritance Constructor Method");
		//ConChild cc = new ConChild();
		//cc.show();
		
		ConChild cc = new ConChild(2000);
		cc.show();
	}
}
