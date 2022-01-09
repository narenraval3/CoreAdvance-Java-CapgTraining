class Student
{
	private static String name;
	private static int usn;
	private static float marks;
	private static String sub;
	
	public static void get()
	{
		name="NaReN";
		usn=39;
		marks=99.9f;
		sub="CES";
	}
	
	public static void disp()
	{
		System.out.println("Name: " +name);
		System.out.println("USN: " +usn);
		System.out.println("Marks: " +marks);
		System.out.println("Sublect: " +sub);
		//System.out.println("Name is: " +name+ " Usn is: " +usn+ " Marks is: " +marks+ " Subject is: " +sub);
	}
}

public class SDemo {

	public static void main(String[] args) {
		Student stud = new Student();
		Student.get();
		Student.disp();
	}
}