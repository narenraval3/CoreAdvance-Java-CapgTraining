//Method Overloading is an example of Compile time polymorphism.

class MethodOverloadingDemo
{
	private int num1, num2, num3;
	
	public void get(int a)
	{
		num1=a;		
	}
	public void get(int b, int c)
	{
		num2=b;
		num3=c;
	}
	
	public void disp()
	{
		System.out.println("1st MethodOverloading is 'a' i.e NUM1: " +num1);
		System.out.println("2nd MethodOverloading is 'b' & 'c' i.e NUM2: " +num2+ " And NUM3: " +num3);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloadingDemo mod = new MethodOverloadingDemo();
		mod.get(100);
		mod.get(200, 300);
		mod.disp();
	}
}