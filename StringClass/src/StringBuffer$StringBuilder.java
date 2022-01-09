
public class StringBuffer$StringBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("  Naren_Raval  ");
		System.out.println(sb);
		
//		StringBuilder sb1 = new StringBuilder("  Naren_Raval  ");
//		System.out.println(sb1);
		
		System.out.println(sb.append("The Almighty"));
		System.out.println(sb.length());
		System.out.println(sb.substring(3, 7));
		
		System.out.println(sb.charAt(6));
		
		System.out.println(sb.indexOf("R"));
		System.out.println(sb.lastIndexOf("v"));
		
		System.out.println(sb.insert(0, "Hi"));
		System.out.println(sb.delete(3, 7));
		
		System.out.println(sb.toString().trim());
		System.out.println(sb.reverse());	
		
		System.out.println(sb.capacity());
			
	}

}
