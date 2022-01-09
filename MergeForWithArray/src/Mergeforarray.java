
public class Mergeforarray {

	public static void main(String abc[]) {
		int x[] = new int[5];
		int y, z;

		for (y = 0; y <= 4; y = y + 1) 
		{
			x[y] = Integer.parseInt(abc[y]);
		}

		for (z = 0; z <= 4; z = z + 1);
		{
			System.out.println("Your val is: " + x[z]);
		}

	}

}
