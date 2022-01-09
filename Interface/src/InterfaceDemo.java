interface Int_Parent
{
	void disp1(); //if no access modifier is mentioned then it is Default
	
	default void disp2() //For complete method in Interface must used default keyword
	{
		System.out.println("For complete/Concrete method in Interface must used default keyword");
	}
	
	public static void disp3()
	{
		System.out.println("Static Method in Iterface");
	}
}

class Int_Child implements Int_Parent
{
	public void disp1()
	{
		System.out.println("Parent Interface Implements by Child");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Int_Child ic = new Int_Child();
		ic.disp1();
		ic.disp2();
		Int_Parent.disp3();
	}

}
