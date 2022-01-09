package packagetwo;

public class MyPackage2 {

	int num1, num2;
	public void get(int a, int b)
	{
		num1 = a;
		num2 = b;
	}
	public void disp()
	{
		System.out.println("This is Package 2");
		System.out.println("NUM1: " +num1);
		System.out.println("NUM2: " +num2);
	}
	public void add()
	{
		System.out.println("ADD: " +(num1+num2));
	}
}
