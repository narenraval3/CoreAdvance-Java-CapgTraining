package Wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		//or,
		Integer i = new Integer(20);
		i = 30;
		
		Integer in = 10;
		int a = 50;
		in = a;      // Autobxing-> Convert Primitive to Wrapper
		System.out.println(in);
		
		int b = in; // Unboxing-> Convert Wrapper To Primitive
		System.out.println(b);
		
		int c = 11;
		Integer val = Integer.valueOf(c); //to convert primitive to wrapper 
		System.out.println(val);
		
		//Long wg = 9879l;
		long l = 34567l;
		//wg = l; //or,
		Long wg = l;
		System.out.println(wg);
		
		long pl = wg;
		System.out.println(wg);
		
		String pll = String.valueOf(l); //primitive to string
		System.out.println(pll);
		
		String wll = wg.toString(wg); //wraper to string
		System.out.println(wll);
	}

}
