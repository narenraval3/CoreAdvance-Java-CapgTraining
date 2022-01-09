package Encapsulation;

public class EncapsulationEmployee {
	
	private String empName;
	private int empId;
	private int empAge;
	
	public void setempName(String empName)
	{
		this.empName = empName;
	}
	public String getempName()
	{
		return empName;
	}
	
	public void setempId(int empId)
	{
		this.empId = empId;
	}
	public int getempId()
	{
		return empId; 
	}
	
	public void setempAge(int empAge)
	{
		if(empAge<=60 && empAge>=120)
			this.empAge = empAge;
	}
	public int getempAge()
	{
		return empAge;
	}
		
	public static void main(String[] args) {
		
		EncapsulationEmployee ee = new EncapsulationEmployee();
		ee.setempName("NAREN");	
		ee.setempId(39);
		ee.setempAge(24);
					
		System.out.println(ee.getempName()+" " +ee.getempId()+" "+ee.getempAge());
	}

}
