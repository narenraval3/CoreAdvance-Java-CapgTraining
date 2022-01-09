class MethodParent
{
	public synchronized void disp()
	{
		System.out.println("Odd Numbers in range b/w 20: ");
		for(int i=1; i<=20; i+=3)
		{
			System.out.println("i: " +i);
		}
		System.out.println();
	}
}

class MChild1 extends Thread
{
	MethodParent p1;
	
	//public MChild1(MethodParent p1)
	public MChild1(MethodParent x)
	{
		p1 = x;
		//this.p1 = p1;
	}
	public void run()
	{
		p1.disp();
	}
}
class MChild2 extends Thread
{
	MethodParent p2;
	//public MChild2(MethodParent p2)
	public MChild2(MethodParent y)
	{
		p2 = y;
		//this.p2 = p2;
	}
	public void run()
	{
		p2.disp();
	}
}

public class MethodLevelNonStaticSynchronization {

	public static void main(String[] args) {
		MethodParent p = new MethodParent();
		MChild1 mc1 = new MChild1(p);
		MChild2 mc2 = new MChild2(p);
		mc1.start();
		mc2.start();

	}

}
