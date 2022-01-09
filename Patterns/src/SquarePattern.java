import java.util.*;
public class SquarePattern {

	public static void main(String[] args) {
		/*
		//if directly giving the value in program 
		 
		int row=3;
		int column=4;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=column; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		//if want to take the input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Rows: ");
		int row = sc.nextInt();
		
		System.out.print("Enter the Number of Columns: ");
		int column = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=column; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
