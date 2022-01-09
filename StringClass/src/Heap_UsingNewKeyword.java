
public class Heap_UsingNewKeyword {

	public static void main(String[] args) throws Exception {
		//String x;
		//x = (abc[0]);
		//String y;
		//y = (abc[1]);
		
		String x = new String("    NaRen  ");
		String y = new String("   RaVal  ");
				
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x.length());
		System.out.println(y.length());
		
		System.out.println(x.toUpperCase());
		System.out.println(y.toUpperCase());
		
		System.out.println();
		
		System.out.println(x.toLowerCase());
		System.out.println(y.toLowerCase());
		
		System.out.println();
		
		System.out.println(x.substring(1, 7));
		System.out.println(y.substring(1, 6));
		
		System.out.println();
		
		System.out.println(x.charAt(4));
		System.out.println(y.charAt(5));
		
		System.out.println();
		
		System.out.println(x.indexOf("e"));
		System.out.println(y.indexOf("l"));
		
		System.out.println();
		
		System.out.println(x.lastIndexOf("R"));
		System.out.println(y.lastIndexOf("l"));
		
		System.out.println();
		
		System.out.println(x.trim());
		System.out.println(y.trim());
		
		System.out.println();
		
		System.out.println(x.compareTo("Narendra"));
		System.out.println(y.compareTo("Rawal"));
		
		System.out.println();
		
		System.out.println(x.concat(" The King of King "));
		System.out.println(y.concat(" The Load of Human Beings "));
		System.out.println();
		
		for(int i=x.length(); i>=0; i--)
		{
			System.out.println(x.charAt(i));
		}
	}

}
