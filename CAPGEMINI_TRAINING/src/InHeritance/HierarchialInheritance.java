package InHeritance;

class GrandFather
{
	String name;
	int age;
	
	GrandFather(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void disp()
	{
		System.out.println("G_Name: " +name+ " G_Age: " +age);
	}
}

class MyFather extends GrandFather
{
	String name;
	int age;
	float height;
	
	MyFather(String name, int age, float height)
	{
		super("Lal_Singh_Rawal", 70);
		this.name=name;
		this.age=age;
		this.height = height;
	}
	public void show()
	{
		super.disp();
		System.out.println("F_Name: " +name+ " F_Age: " +age+ " Height: " +height) ;
		System.out.println();
	}
}

class MyUncle extends GrandFather
{
	String name;
	int age;
	String addrs;
	
	MyUncle(String n, int a, String ads)
	{
		super("Singh_Rawal", 80);
		name = n;
		age = a;
		addrs = ads;		
	}
	public void dispShow()
	{
		super.disp();
		System.out.println("Name: " +name+ " Age: " +age+ " Addrs: " +addrs);
	}
}

public class HierarchialInheritance {
	
	public static void main(String[] args) {
		
		MyFather mf = new MyFather("Karna Rawal", 55, 6.1f);
		mf.show();
		
		MyUncle mu = new MyUncle("Dorja Rawal", 45, "Lamki Chuha");
		mu.dispShow();
	}

}
