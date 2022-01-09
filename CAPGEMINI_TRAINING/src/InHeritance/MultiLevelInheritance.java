package InHeritance;

	class College
	{
		String cName;
		String cAdd;
		
		public void collegeInput()
		{
			cName = "BTI";
			cAdd = "Bangalore";
		}
		
		public void collegeDisplay()
		{
			System.out.println("C_Name: " +cName+ " C_Add: " +cAdd);
		}
	}
	
	class Department extends College
	{
		String dName;
		int dCode;
		
		public void departInput()
		{
			super.collegeInput();
			dName = "Computer Science";
			dCode = 977;
		}
		
		public void departDisplay()
		{
			super.collegeDisplay();
			System.out.println("Name: " +dName+ " dCode: " +dCode);
		}
	}

	class Student extends Department
	{
		String name;
		int usn;
		
		public void studentInput()
		{
			super.departInput();
			name = "Naren_Rawal";
			usn = 39;
		}
		
		public void studentShow()
		{
			super.departDisplay();
			System.out.println("Name: " +name+ " USN: " +usn);
		}
	}

	public class MultiLevelInheritance {
		
		public static void main(String[] args) {
			
			Student ss = new Student();
			ss.studentInput();
			ss.studentShow();
		}
	}