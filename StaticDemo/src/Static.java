class StaticDemo
{
	private static int num1, num2;
	
	public static void get()
	//public static void get(int a, int b)
	{
		num1=10;
		num2=5;	
		
		//num1=a;
		//num2=b;
	}
	public static void disp()
	{
		System.out.println("Num1 is: " +num1);
		System.out.println("Num2 is: " +num2);
	}
}
public class Static {

	public static void main(String[] args) {
		
		// in static no need to create object we can use class name directly
		
		StaticDemo.get();
		//StaticDemo.get(100, 200);
		StaticDemo.disp();
	}
}