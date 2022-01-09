class FinalizedDemo
{
	private int num1, num2;
	
	public FinalizedDemo()
	{
		num1=100;
		num2=200;
	}
	public void disp()
	{
		System.out.println("NUM1: " +num1);
		System.out.println("NUM2: " +num2);
	}
	
	protected void finalize()
	{
		System.out.println("This is Finalize Method");
	}
}
public class FinalizeMethod {

	public static void main(String[] args) {
		FinalizedDemo fd = new FinalizedDemo();
		fd.disp();
		
		fd.finalize();
		fd.disp();
		
		fd=null;
		fd.disp();
	}
}
