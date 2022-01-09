package InHeritance;

class Father
{
	String fName;
	String lName;
	int age;
	
	public void Input()
	{
		fName = "Karna";
		lName = "Rawal";
		age = 57;
	}
	
	public void Display()
	{
		System.out.println("F_Name: " +fName+ " L_Name: " +lName+ " Age: " +age);
	}
}

class Son extends Father
{
	String name;
	int age;
	
	public void Input1()
	{
		super.Input();
		name = "Naren_Rawal";
		age = 24;
	}
	
	public void Display1()
	{
		super.Display();
		System.out.println("Name: " +name+ " Age: " +age);
	}
}

public class SingleInheritance {
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.Input1();
		s.Display1();
	}
}