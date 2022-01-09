package Polymorphism.CompileTime;

//static method cannot be overload

//Same data_type must be diff.number of parameters----------------
class Student
{
	private String sName, sUsn, sBranch;
	
	public void inputStudent(String sName)
	{
		this.sName = sName;
	}
	public void inputStudent(String a, String b)
	{
		sUsn = a;
		sBranch = b;
	}
	
	public void show()
	{
		System.out.println("S_Name: " +sName);
		System.out.println("s_USN: " +sUsn+ ", s_Branch: " +sBranch);
		System.out.println();
	}
}

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.inputStudent("Naren");
		s.inputStudent("39", "CSE101");
		s.show();

//-------------------------------------------------------		
		
		Employee e = new Employee();
		e.empInput("Aryan");
		e.empInput(67);
		e.disp();
		
	}
}
	
//Same number of parameters must be diff.data_type----------------
class Employee
{
	private String eName;
	private int eId;
		
	public void empInput(String name) 
    {
		eName = name;
	}
	public void empInput(int eId) 
	{
		this.eId = eId;
	}
		
	public void disp()
	{
		System.out.println("Emp_Name: " +eName+ ", Emp_Id: " +eId);
	}
}
