package Interface;

interface Parent1
{
	default void Method1()  //for concreet method inside interface used default keyword
	{
		System.out.println("Parent1 Method1");
	}
	
	public static void Method2()
	{
		System.out.println("Parent1 Method2");
	}
	
	public abstract void Method3();
	//or, simply
	//void Method3();
	
}

interface Parent2
{
	void Method4();
}

class InterfaceStaticAndConcrete implements Parent1, Parent2
{
	public void Method3()
	{
		System.out.println("Parent1 Method3");
	}
	
	public void Method4()
	{
		System.out.println("Parent2 Method4");
	}
}

public class StaticAndConcreteInterface {

	public static void main(String[] args) {
		
		InterfaceStaticAndConcrete ics = new InterfaceStaticAndConcrete();
		ics.Method1();
		
		Parent1.Method2();
		
		ics.Method3();
		ics.Method4();

	}

}
