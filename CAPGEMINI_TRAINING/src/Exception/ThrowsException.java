package Exception;

public class ThrowsException {
	
	void m1() throws Exception
	{
		System.out.println("This is M1()");
		int a=10/0;
	}
	
	void m2()
	{
		try {
			this.m1();
			System.out.println("This is M2()");
		}
		catch(Exception e2)
		{
			////Code or Anything can be written here
		}
	}
	
	void m3()
	{
		this.m2();
		System.out.println("This is M3()");
	}
	
	void m4()
	{
		this.m3();
			System.out.println("This is M4()");
	}
	
	void m5() 
	{
		this.m4();
		System.out.println("This is M5()");
	}

	public static void main(String[] args)  {
		
		ThrowsException te = new ThrowsException();
		te.m5();

	}

}
