class MultilevelParent
{
	private int num1;
	
	public void get1()
	{
		num1=1111;
	}
	public void disp1()
	{
		System.out.println("NUM1: " +num1);
	}
}
class MultilevelChild1 extends MultilevelParent
{
	private int num2;
	
	public void get2()
	{
		super.get1();
		num2=2222;
	}
	public void disp2()
	{
		super.disp1();
		System.out.println("NUM2: " +num2);
	}
}
class MultilevelChild2 extends MultilevelChild1
{
	private int num3;
	
	public void get3()
	{
		super.get2();
		num3=3333;
	}
	public void disp3()
	{
		super.disp2();
		System.out.println("NUM3: " +num3);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		MultilevelChild2 mlc2 = new MultilevelChild2();
		mlc2.get3();
		mlc2.disp3();
	}
}
