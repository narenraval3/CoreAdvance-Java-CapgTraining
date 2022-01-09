package Constructor;

public class ConstructorDemo {
	
	String name;
	int usn;
	float marks;
	
	ConstructorDemo(String name, int roll)
	{
		this.name = name;
		usn = roll;
		marks = 99.9f;
	}
	
	public void show()
	{
		System.out.println("Name: " +name+ " USN: " +usn+ " Marks: " +marks);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo("Naren", 39);
		cd.show();
	}

}
