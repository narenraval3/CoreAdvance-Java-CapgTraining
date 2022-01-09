class ClassDemo
{
	private int num1, num2;
	
	public void input(int a, int b)
	{
		num1=a;
		num2=b;
	}
	
	public void print()
	{
		System.out.println("First Num val is: " +num1);
		System.out.println("Second Num val is: " +num2);
		//System.out.println("Num1 is: " +num1+ " Num2 is: " +num2);
	}
}

public class Demo {

	public static void main(String[] args) {
		ClassDemo cd = new ClassDemo();
		cd.input(111, 222);
		cd.print();
	}
}