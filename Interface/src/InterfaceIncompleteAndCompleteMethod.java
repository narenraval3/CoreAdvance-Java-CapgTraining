abstract class AbsParent
{
	abstract public void disp1();
	
	public void disp2()
	{
		System.out.println("disp2 is Complete Method in Abstact Parent");
	}
}
class AbsChild extends AbsParent
{
	public void disp1()
	{
		System.out.println("disp1 is Complete Method in AbChild");
	}
}

public class InterfaceIncompleteAndCompleteMethod {

	public static void main(String[] args) {
		AbsChild abc = new AbsChild();
		abc.disp1();
		abc.disp2();
	}

}
