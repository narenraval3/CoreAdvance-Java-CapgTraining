abstract class ABParent
{
	abstract public void disp1();
	
	public static void disp2()
	{
		System.out.println("Abstract Parent Static Method");
	}
}
class ABChild extends ABParent
{
	public void disp1()
	{
		System.out.println("Child solved Absract Parent");
	}
}

public class AbstractStatic {

	public static void main(String[] args) {
		ABChild ac = new ABChild();
		ac.disp1();
		ABParent.disp2();
		//ac.disp2();
	}

}
