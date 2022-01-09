package Polymorphism.RunTime;

//static method cannot be overload

class Parent
{
	protected String Name; //protected static String Name;
	protected int Contact; //protected static int Contact;
	
	public void input(String Name, int Contact)
	//Or, public void input()
	{
		this.Name = Name;
		this.Contact = Contact;
		
		//OR,
		//Name = "Hari";
		//Contact = 345678;
	}
	
	public void show() //public static void show()
	{
		System.out.println("P_Name: " +Name+ ", P_Contact: " +Contact);
		System.out.println();
	}
}

class Son extends Parent
{
	public void input(String nme, int cont)
	{
		Name = nme;    // we are using name & contact because
		Contact = cont;// on parent class it is defined as protected
	}
	
	public void show() //public static void show()
	{
		System.out.println("S_Name: " +Name+ ", S_Contact: " +Contact);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.input("KARNA",987651);
		//p.input();
		p.show();
		
		Son s = new Son();
		s.input("NARAEN", 91087178);
		s.show();
	}

}
