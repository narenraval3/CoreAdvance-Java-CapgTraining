import packagetwo.MyPackage2;
import packagetwo.subpackagetwo.SubMyPackage2;

public class PackageProgram2 {

	public static void main(String[] args) {
		
		System.out.println("This is Package inside the Package Program");
		System.out.println();
		
		SubMyPackage2 smp = new SubMyPackage2();
		smp.show();
		
		MyPackage2 mp = new MyPackage2();
		mp.get(10, 7);
		mp.disp();
		mp.add();
	}

}
