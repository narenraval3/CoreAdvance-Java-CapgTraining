class ConstructorArgs
{
	private int num1, num2;
	
	public ConstructorArgs(int a, int b)
	{
		num1=a;
		num2=b;
	}
	public void disp()
	{
		System.out.println("NUM1 is: " +num1);
		System.out.println("NUM2 is: " +num2);
	}
}
public class ConstructorArguments {

	public static void main(String[] args) {
		ConstructorArgs ca = new ConstructorArgs(1000, 2000);
		ca.disp();
	}

}
