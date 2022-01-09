import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
	String employeeName;
	String employeeID;
	
	void getEmployeeName(String name)
	{
		System.out.println(name);
	}
	void getEmployeeID(String id)
	{
		System.out.println(id);
	}
	
	void setEmployeeName(String name)
	{
		this.employeeName=name;
	}
	void setEmployeeID(String id)
	{
		this.employeeID=id;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of records to be created");
		int n=sc.nextInt();
		
		Map<String,String> hm=new HashMap<>(n);
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the records? ");
			String id=sc.nextLine();
			String name=sc.nextLine();
			hm.put(id,name);
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the id");
			String id=sc.nextLine();
			hm.get(id);
		}
	}
}
