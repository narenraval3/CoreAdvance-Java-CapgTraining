package ClassObject;
class Customer
{
	static String custName;
	int custId;
	String custAddress;
	static long custPhone;
	
public void Deposite()
{
	System.out.println("Deposite Money by " + custId);
}

public static void Withdrawl()
{
	System.out.println("Withdrawl Money by " + custName);
}
}

public class ClassAndObject {

	public static void main(String[] args) {
		
		Customer cus = new Customer();
		
		Customer.custName = "Naren";
		cus.custId = 101;
		cus.custAddress = "Lamki";
		Customer.custPhone = 9815659620l;
		
		cus.Deposite();
		Customer.Withdrawl();
		
		System.out.println("custName: " +Customer.custName+ " custId: " +cus.custId+ " custAddress: " +cus.custAddress+ " custPhone: " +Customer.custPhone);
		System.out.println();
		//------------------------------
		
		Customer cus1 = new Customer();
		
		Customer.custName = "Aryan";
		cus1.custId = 201;
		cus1.custAddress = "Chuha";
		Customer.custPhone = 9108717894l;
		
		cus1.Deposite();
		Customer.Withdrawl();
		
		System.out.println("custName: " +Customer.custName+ " custId: " +cus1.custId+ " custAddress: " +cus1.custAddress+ " custPhone: " +Customer.custPhone);
	}

}

//------------------------------------------------------------------------------------------------------------------------------------------------------------
//OR, We can just include inside main class

//package ClassObject;
//public class ClassAndObject {
//	
//	static String custName;
//	int custId;
//	String custAddress;
//	static long custPhone;
//	
//public void Deposite()
//{
//	System.out.println("Deposite Money by " + custId);
//}
//
//public static void Withdrawl()
//{
//	System.out.println("Withdrawl Money by " + custName);
//}
//
//	public static void main(String[] args) {
//		
//		ClassAndObject cus = new ClassAndObject();
//		
//		ClassAndObject.custName = "Naren";
//		cus.custId = 101;
//		cus.custAddress = "Lamki";
//		ClassAndObject.custPhone = 9815659620l;
//		
//		//---Latest value will be taken
//		ClassAndObject.custName = "Naren_Raval";
//		cus.custId = 111;
//		//----------------------
//		
//		cus.Deposite();
//		ClassAndObject.Withdrawl();
//		
//		System.out.println("custName: " +ClassAndObject.custName+ " custId: " +cus.custId+ " custAddress: " +cus.custAddress+ " custPhone: " +ClassAndObject.custPhone);
//		System.out.println();
//		//------------------------------
//		
//		ClassAndObject cus1 = new ClassAndObject();
//		
//		ClassAndObject.custName = "Aryan";
//		cus1.custId = 201;
//		cus1.custAddress = "Chuha";
//		ClassAndObject.custPhone = 9108717894l;
//		
//		cus1.Deposite();
//		ClassAndObject.Withdrawl();
//		
//		System.out.println("custName: " +ClassAndObject.custName+ " custId: " +cus1.custId+ " custAddress: " +cus1.custAddress+ " custPhone: " +ClassAndObject.custPhone);
//	}
//
//}
