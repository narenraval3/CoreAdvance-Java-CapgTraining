
public class Literals_StringConstantPool {

	public static void main(String[] args) {
		
		String s1 = "Delhi";
		String s2 = "Delhi";
		String s3 = "Delhi";
		String s4 = "Goa";
		String s5 = "Goa";
		
		String s6 = new String("HI");
		String s7 = new String("Hello");
		s7 = "Helo";
		
		System.out.println("S1: " +s1);
		System.out.println("S2: " +s2);
		System.out.println("S3: " +s3);
		System.out.println();
		
		System.out.println("S4: " +s4);
		System.out.println("S5: " +s5);
		
		System.out.println();
		
		System.out.println("S6: " +s6);
		System.out.println("S7: " +s7);
		System.out.println("S7: " +s7);
		
		System.out.println();
		
		System.out.println("Only one object created in SCP for s1, s2, s3 ");
		System.out.println("S1: " +s1.hashCode());		
		System.out.println("S2: " +s2.hashCode());
		System.out.println("S3: " +s3.hashCode());
		System.out.println();
		
		System.out.println("Only one object created in SCP for s4, s5 ");
		System.out.println("S4: " +s4.hashCode());
		System.out.println("S5: " +s5.hashCode());
		
		System.out.println();
		System.out.println("S6: " +s6.hashCode());
		System.out.println("S7: " +s7.hashCode());
		System.out.println("S7: " +s7.hashCode());
	}

}
