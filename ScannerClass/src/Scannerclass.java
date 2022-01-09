import java.util.Scanner;
public class Scannerclass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int usn;
		float marks;
		
		System.out.println("Enter your Name: ");
		name = scanner.nextLine();
		
		System.out.println("Enter your USN: ");
		usn = scanner.nextInt();
		
		System.out.println("Enter your Marks: ");
		marks = scanner.nextFloat();
		
		System.out.println(name);
		System.out.println(usn);
		System.out.println(marks);
		//System.out.println(name+ " " +usn+ " " +marks);
	}

}
