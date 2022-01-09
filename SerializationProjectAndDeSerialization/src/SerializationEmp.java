import java.io.*;

public class SerializationEmp {

	public static void main(String[] args) throws Exception {
		
		Employee emp = new Employee();
		emp.setEmpId(11);
		emp.setEmpName("Harry");
		emp.setEmpSalary(24356.32);
		
		FileOutputStream fileout = new FileOutputStream("C:\\Users\\NaReN RaWal\\eclipse-workspace\\SerializationProjectAndDeSerialization\\employe.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(emp);
		
		fileout.close();
		out.close();
		
		System.out.println("Serialization data is saved is on emply.txt");
	}

}
