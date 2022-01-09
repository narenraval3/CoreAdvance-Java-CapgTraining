class BlockLevelParent
{
	public void disp()
	{
		synchronized(this)
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

class BlockChild1 extends Thread
{
	BlockLevelParent p1;
	
	public BlockChild1(BlockLevelParent p1)
	{
		this.p1 = p1;
	}
	public void run()
	{
		p1.disp();
	}
}
class BlockChild2 extends Thread
{
	BlockLevelParent p2;
	
	public BlockChild2(BlockLevelParent p2)
	{
		this.p2 = p2;
	}
	public void run()
	{
		p2.disp();
	}
}

public class BlockLevelNonStaticSynchronization {

	public static void main(String[] args) {
		BlockLevelParent p = new BlockLevelParent();
		BlockChild1 c1 = new BlockChild1(p);
		BlockChild2 c2 = new BlockChild2(p);
		c1.start();
		c2.start();
	}

}
