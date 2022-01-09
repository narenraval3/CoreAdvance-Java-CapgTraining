package ClassObject;

public class StudentClassDemo {
		
	{
		System.out.println("This is instance block");
	}
	
	static
	{
		System.out.println("This is static block");
	}
		
	public static void main(String[] args) {
		
		StudentClassDemo cd = new StudentClassDemo();
		
		Student stud = new Student("Rn", 39, 99.9f, 23456789l);
		stud.disp();
	}

	}