package Interface;

interface Father
{
	void FName();
	void FAge();
}
interface Mother 
{
	void MAddrs();
	void MPhone();
}

class Son
{
	String SName;
	int SContact;
	
	Son(String SName, int SContact)
	{
		this.SName = SName;
		this.SContact = SContact;
	}
	
	public void disp()
	{
		System.out.println("Son_Name: " +SName+ ", Son_contact: " +SContact);
		System.out.println();
	}
}

class GrandSon extends Son implements Father, Mother
{
	String GName;
	
	GrandSon(String GName)
	{
		super("Ram", 9876543);
		this.GName = GName;
	}
	public void show()
	{
		super.disp();
		System.out.println("G_Name: " +GName);
	}
	
	public void FName()
	{
		System.out.println("Bishnu");
	}
	public void FAge()
	{
		System.out.println("55");
		System.out.println();
	}
	
	public void MAddrs()
	{
		System.out.println("Mumbai");
	}
	public void MPhone()
	{
		System.out.println("234567890");
		System.out.println();
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		GrandSon gs = new GrandSon("Aryan");
		gs.FName();
		gs.FAge();
		
		gs.MAddrs();
		gs.MPhone();
		
		gs.show();

	}
}
