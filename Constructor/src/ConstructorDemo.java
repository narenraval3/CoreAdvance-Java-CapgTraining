class Constructor
{
	private  int num1, num2;
	
	public Constructor()
	{
		num1=100;
		num2=200;
	}
	public void disp()
	{
		System.out.println("NUM1: " +num1);
		System.out.println("NUM2: " +num2);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Constructor c = new Constructor();
		c.disp();
	}

}
