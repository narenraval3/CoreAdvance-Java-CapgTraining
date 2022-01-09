import static java.lang.System.*;
class StatParent
{
	private static int num1;
	
	public static void get1()
	{
		num1=100;
	}
	public static void disp1()
	{
		out.println("NUM1 is: " +num1);
	}
}

class StatChild //extends StatParent
{
	private static int num2;
	
	public static void get2()
	{
		StatParent.get1();
		num2=200;
	}
	public static void disp2()
	{
		StatParent.disp1();
		out.println("NUM2 is: " +num2);
	}
}

public class SingleInheritanceStatic {

	public static void main(String[] args) {
		out.println("This is Single Inheritance Static Method");
		StatChild.get2();
		StatChild.disp2();
	}

}
