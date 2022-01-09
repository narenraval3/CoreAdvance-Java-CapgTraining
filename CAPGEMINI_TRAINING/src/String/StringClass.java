package String;

public class StringClass {

	public static void main(String[] args) {
		
		String s1 = "Hello"; //Literal way will create an obj on String Literal Pool
		String s2 = "Hello";
		String s3 = " Naren_Raval          ";
		
		String s4 = new String("Hello-World"); //Obj will create in Heap 
		String s5 = new String("Hello-Nepal");
		s5 = new String("Hello-India"); //will override the previous s5
		
		System.out.println("S1: " +s1);
		System.out.println("S2: " +s2);
		System.out.println("S3: " +s3);
		System.out.println("S4: " +s4);
		System.out.println("S5: " +s5);
		System.out.println();
		
		System.out.println("Only one obj will create for s1 & s2");
		System.out.println("S1 Obj: " +s1.hashCode());
		System.out.println("S2 Obj: " +s2.hashCode());
		System.out.println("S3 Obj: " +s3.hashCode());
		System.out.println("S4 Obj: " +s4.hashCode());
		System.out.println("S5 Obj: " +s5.hashCode());
		System.out.println();
		
////////String Methods
		System.out.println("Length: " +s3.length());
		System.out.println("Uppercase: " +s3.toUpperCase());
		System.out.println("Lowercase: " +s3.toLowerCase());
		System.out.println("CharAt: " +s3.charAt(2));
		System.out.println("Substring: " +s3.substring(3, 10));
		System.out.println("Indent: " +s3.indent(3));
		System.out.println("Index of: " +s3.indexOf("R"));
		System.out.println("Last Index of: " +s3.lastIndexOf("v"));
		System.out.println("Compare to: " +s3.compareTo("Naren"));
		System.out.println("Compare to Ignore Case: " +s3.compareToIgnoreCase(s5));
		System.out.println("Ignore Case: " +s3.equalsIgnoreCase(s2));
		System.out.println("Concate: " +s3.concat("How Are You? "));
		System.out.println("Trim: " +s3.trim());
		System.out.println("Start With: " +s3.startsWith(s1));
		System.out.println("End With: " +s3.endsWith(s5));
		System.out.println("Code Point: " +s3.codePointAt(1));
		System.out.println("Replace: " +s3.replace("a", "r"));
		System.out.println("Replace First: " +s3.replaceFirst("N", "n"));
		System.out.println("Replace All: " +s3.replaceAll(s3, s2));
		System.out.println("Repeate: " +s3.repeat(3));
	}

}
