abstract class AParent
{
	abstract public void disp1();
	abstract public void disp2();
}

abstract class Child1 extends AParent
{
	public void disp1()
	{
		System.out.println("Child1 Inherits Parent disp1 method");
	}
	abstract public void disp2();
}

class Child2 extends Child1
{
	public void disp2()
	{
		System.out.println("Child2 Inherits Parent disp2 method by Child1");
	}
	public void disp3()
	{
		System.out.println("Child2 having own function");
	}
}

public class InterfaceAbstractMultiple {

	public static void main(String[] args) {
		Child2 cc = new Child2();
		cc.disp1();
		cc.disp2();
		
		//AParent ap = new Child2();
		//ap.disp1();
		//ap.disp2();
	}

}
