
public class Arrays {

	public static void main(String[] args) {
		//int a[] = new int[5];
		
		int [] a = new int[5];
		System.out.println(a);
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("For Loop1: " +a[i]);
		}
		System.out.println();
		
		int a2[] = {1,2,3,4,5,6,7,8,8,9};
		for(int i=0; i<a2.length; i++)
		{
			System.out.println("For Loop2: " +a2[i]);
		}
		System.out.println();
		
		for(int i: a2)
		{
			System.out.println("For Each Loop: " +i);
		}
		System.out.println();
		
		String[] s = new String[3];
		s[0] = "AAA";
		s[1] = "BBB";
		s[2] = "CCC";
		//s[3] = "DDD";
		
		for(String s1: s)
		{
			System.out.println("For Each Loop2: " +s1);
		}
		
	}
}
