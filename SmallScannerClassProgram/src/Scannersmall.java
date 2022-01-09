import java.util.Scanner;
public class Scannersmall {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		float y;
		String z;
		
		System.out.println("Enter Integer Value: ");
		x = scanner.nextInt();
		
		System.out.println("Enter Float Value: ");
		y = scanner.nextFloat();
		
		System.out.println("Enter String Value: ");
		z = scanner.next();

		System.out.println("Your Integer val: " +x);
		System.out.println("Your Float val: " +y);
		System.out.println("Your String val: " +z);
	}
}