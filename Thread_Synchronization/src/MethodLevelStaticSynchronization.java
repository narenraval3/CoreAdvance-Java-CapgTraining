class MethodLevelParent
{
	public static synchronized void disp()
	{
		System.out.println("Even Numbers in range b/w 20: ");
		for(int i=2; i<=20; i+=2)
		{
			System.out.println("i: " +i);
		}
		System.out.println();
	}
}

class Child extends Thread
{
	public void run()
	{
		MethodLevelParent.disp();
	}
}
class Child1 extends Thread
{
	public void run()
	{
		MethodLevelParent.disp();
	}
}


public class MethodLevelStaticSynchronization {

	public static void main(String[] args) {
		Child c = new Child();
		Child1 c1 = new Child1();
		c.start();
		c1.start();
	}

}
