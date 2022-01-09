interface Parent1
{
	public void disp1();
}
interface Parent2
{
	public void disp2();
}

class Child implements Parent1, Parent2
{
	public void disp1()
	{
		System.out.println("Parent1 disp1");
	}
	public void disp2()
	{
		System.out.println("Parent2 disp2");
	}
}

public class InterfaceOldVersion {

	public static void main(String[] args) {
		Child c = new Child();
		c.disp1();
		c.disp2();
	}

}
