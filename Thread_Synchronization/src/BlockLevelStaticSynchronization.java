class BlockParent
{
	public static void disp()
	{
		synchronized(BlockParent.class)
		{
			System.out.println("Numbers: ");
			for(int i=1; i<=5; i++)
			{
				System.out.println("i: " +i);
			}
			System.out.println();
		}
	}
}

class BChild1 extends Thread
{
	public void run()
	{
		BlockParent.disp();
	}
}
class BChild2 extends Thread
{
	public void run()
	{
		BlockParent.disp();
	}
}

public class BlockLevelStaticSynchronization {

	public static void main(String[] args) {
		BChild1 cc1 = new BChild1();
		BChild2 cc2 = new BChild2();
		cc1.start();
		cc2.start();
	}

}
