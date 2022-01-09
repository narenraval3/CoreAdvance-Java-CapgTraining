class NoReturn
{
	private int num1, num2;
	//private static int num1, num2;
	
	public void get()
	//public void get(int a, int b)
	//public static void get()
	{
		num1=10;
		num2=5;
		
		//num1=a;
		//num2=b;
	}
	
	//public static void add()
	public void add()
	{
		System.out.println(num1+num2);
	}
	//public static void sub()
	public void sub()
	{
		System.out.println(num1-num2);
	}
	
	//public static void disp()
	public void disp()
	{
		System.out.println("Num1 is: " +num1);
		System.out.println("Num2 is: " +num2);
		System.out.println("Add is: " +(num1+num2));
		System.out.println("Sub is: " +(num1-num2));
	}
}
public class NoReturnType {

	public static void main(String[] args) {
		NoReturn nr = new NoReturn();
		nr.get();
		//nr.get(100, 200);
		nr.disp();
		
		//NoReturn.get();
		//NoReturn.disp();
	}

}
