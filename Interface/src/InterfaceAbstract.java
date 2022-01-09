abstract class Parent
{
	abstract public void disp1();
	abstract public void disp2();	
}

class AbstractChild extends Parent
{
	public void disp1()
	{
		System.out.println("Child Inherited Abstract Parent disp1");
	}
	public void disp2()
	{
		System.out.println("Child Inherited Abstract Parent disp2");
	}
}

public class InterfaceAbstract {

	public static void main(String[] args) {
		AbstractChild ac = new AbstractChild();
		ac.disp1();
		ac.disp2();
	}

}
