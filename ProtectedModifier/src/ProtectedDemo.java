class Protected_Parent
{
	protected int num1, num2;
	
	public void get1()
	{
		num1=100;
	}
	public void disp1()
	{
		System.out.println("Protected_Parent NUM1: " +num1);
	}
}
class Protected_Child extends Protected_Parent
{
	//no need to initialized num2 becuz child can use parent num2 as it is protected
	public void get2()
	{
		super.get1();
		num2=200; //it is initialized in parent class
	}
	public void disp2()
	{
		super.disp1();
		System.out.println("Protected_Child NUM2: " +num2);
	}
}

public class ProtectedDemo {

	public static void main(String[] args) {
		Protected_Child pc = new Protected_Child();
		pc.get2();
		pc.disp2();
	}

}
