package String;

public class StringBuffer_StringBuilder {
//StringBuffer is Thread Safe i.e. Synchronized
//Only one thread at a time Less efficient
//StringBuilder is Not Thread Safe i.e. Not Synchronized
//More efficient that String Buffer
	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("  Hello World ");
		System.out.println("StringBuffer: " +sbf);
		
		StringBuilder sbl = new StringBuilder("  Naren Raval  ");
		System.out.println("StringBuilder: " +sbl);
		System.out.println();
		
//StringBuffer and StringBuilder Methods are same
		System.out.println("Append: " +sbf.append(" Kaisa Ho "));
		System.out.println("Append: " +sbl.append(" The King "));
		System.out.println("Length: " +sbf.length());
		System.out.println("Substring: " +sbf.substring(2,4));
		System.out.println("Char At: " +sbf.charAt(2));
		System.out.println("Capacity: " +sbf.capacity());
		System.out.println("Index Of: " +sbf.indexOf("W"));
		System.out.println("Last Index of: " +sbf.lastIndexOf("o"));
		System.out.println("To String: " +sbf.toString());
		System.out.println("For Trim: " +sbf.toString().trim());
		System.out.println("To do Reverse: " +sbf.reverse());
		System.out.println("To Insert: " +sbf.insert(0, "Hi!"));
		System.out.println("Get Class: " +sbf.getClass());
		System.out.println("To Replace: " +sbf.insert(0, sbl, 1, 7));
		System.out.println("To Delete: " +sbf.delete(1, 6));
		System.out.println("CodePoints: " +sbf.codePoints());	
	}

}
