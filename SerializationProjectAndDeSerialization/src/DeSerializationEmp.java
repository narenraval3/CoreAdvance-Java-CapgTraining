import java.io.*;

public class DeSerializationEmp {

	public static void main(String[] args) throws Exception {
		
		Employee emp = new Employee();
		
		FileInputStream filein = new FileInputStream("C:\\Users\\NaReN RaWal\\eclipse-workspace\\SerializationProjectAndDeSerialization\\employe.txt");

		ObjectInputStream in = new ObjectInputStream(filein);
		emp = (Employee) in.readObject();
		
		System.out.println("Name: " +emp.getEmpName()+ " Id: " +emp.getEmpId());
		System.out.println("Salary: " +emp.getEmpSalary());
		
		in.close();
		filein.close();
	} 

}
