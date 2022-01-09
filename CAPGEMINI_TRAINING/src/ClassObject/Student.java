package ClassObject;

public class Student {
		
	String name;
	static int usn;
	float marks;
	long phone;
		
	public Student(String a, int b, float c, long d)
	{
		this.name = a;
		this.usn  = b;
		this.marks = c;
		this.phone = d;
	}
		
	public void disp()
	{
		System.out.println(name+ " " +usn+ " " +marks+ " " +phone);
	}
 }
