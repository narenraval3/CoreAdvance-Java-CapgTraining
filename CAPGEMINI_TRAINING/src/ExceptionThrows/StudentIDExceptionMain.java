package ExceptionThrows;

public class StudentIDExceptionMain {

	public static void main(String[] args) {
		
		StudentIDExceptionMain stm = new StudentIDExceptionMain();
		
		StudentDetails sd = new StudentDetails();
		sd.setSName("Naren");
		sd.setSId("1BH17CS039");
		
		try {
			stm.getStudent(sd);
		} 
		catch (StudentIDException e)
		{
		System.out.println("Do Correct your s_Id: " +e.getMessage());	
		}
	}
	
	public void getStudent(StudentDetails stu) throws StudentIDException
	{
		if(!stu.getSId().startsWith("1BH"))
		{
			throw new StudentIDException(stu.getSId());
		}
		else
		{
			System.out.println("Your s_Id is Correct");
		}
	}

}
