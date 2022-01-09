import java.util.*;
class ScannerDemo
{
	//private  String name;
	private int num1, num2;
	//private String cast;
	
	public void get()
	{
		Scanner scann = new Scanner(System.in);
		
		//System.out.println("Enter Your Name: ");
		//name=scann.nextLine();
		
		System.out.println("Enter Num1 val: ");
		num1=scann.nextInt();
		
		System.out.println("Enter Num2 val: ");
		num2=scann.nextInt();
		
		//scann.nextLine();
		
		//System.out.println("Enter Your Cast: ");
		//cast=scann.nextLine();
	}
	public void disp()
	{
		//System.out.println("Name: " +name);
		System.out.println("Num1 is: " +num1);
		System.out.println("Num2 is: " +num2);
		//System.out.println("Cast: " +cast);
	}
}
public class COScanner {

	public static void main(String[] args) {
		ScannerDemo sd = new ScannerDemo();
		sd.get();
		sd.disp();
	}
}