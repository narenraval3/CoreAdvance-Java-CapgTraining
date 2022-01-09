class ReturnDemo
{
	private int num1, num2;
	
	//private static int num1, num2;
	
	public void get()
	//public void get(int a, int b)
	//public static void get()
	{
		num1 = 50;
		num2 = 10;
		
		//num1 = a;
		//num2 = b;
	}
	
	public int add()
	//public static int add()
	{
		return(num1+num2);
	}
	public int sub()
	//public static int sub()
	{
		return(num1-num2);
	}
	public int mul()
	//public static int mul()
	{
		return(num1*num2);
	}
	
	public void disp()
	//public static void disp()
	{
		System.out.println("Num1 is: " +num1);
		System.out.println("Num2 is: " +num2);
		
		// function or method have not call in class then we have to call in main method
		
		//System.out.println("Add is: " +add()); 
		//System.out.println("Sub is: " +sub());
		//System.out.println("Mul is: " +mul());
		//System.out.println("Mul is: " +num1*num2);
	}
}
public class ReturnType {

	public static void main(String[] args) {
		ReturnDemo rd = new ReturnDemo();
		rd.get();
		//rd.get(22, 2);
		rd.disp();
		
		//ReturnDemo.get();
		//ReturnDemo.disp();
		
		//we can call function in main like this way
		
		System.out.println("Add is: " +rd.add()); 
		System.out.println("Sub is: " +rd.sub());
		System.out.println("Mul is: " +rd.mul());
		
		//System.out.println("Add is: " +ReturnDemo.add()); 
		//System.out.println("Sub is: " +ReturnDemo.sub());
		//System.out.println("Mul is: " +ReturnDemo.mul());	
	}
}