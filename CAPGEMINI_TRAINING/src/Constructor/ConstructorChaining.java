package Constructor;

class A
{
	int id;
	void M1()
	{
		System.out.println("A's Method1");
	}
	
	A()
	{
		//this.M1();
		System.out.println("Constructor A()");
	}
}

class B extends A
{
	int usn;
	void M2()
	{
		System.out.println("B's Method2");
	}	
	
	B()
	{
		//this.M2();
		System.out.println("Constructor B()");
	}
}

class C extends B
{
	int val;
	
	String M3()
	{
		return("C's Method3");
	}
	
	C()
	{
		//super(); //--> Immediate Super Class & No need to call super automatically it will load
		System.out.println("Constructor C()");
		System.out.println();
		this.M3(); //--> Current Class Object
		this.M2();
		this.M1();
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		C c = new C();	
		//String s = c.M3();
	}

}
