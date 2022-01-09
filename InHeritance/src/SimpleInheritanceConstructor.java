class SIC_Parent
{
	public SIC_Parent(int a)
	{
		System.out.println("Parent Val is: " +a);
	}
}
class SIC_Child extends SIC_Parent
{
	public SIC_Child(int b)
	{
		super(1000);
		System.out.println("Child Val is: " +b);
	}
}
public class SimpleInheritanceConstructor {

	public static void main(String[] args) {
		SIC_Child sc = new SIC_Child(2000);
	}

}
